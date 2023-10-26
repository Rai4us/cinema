package org.shevchenko.client.mapper.entity;

import org.apache.ibatis.annotations.*;
import org.shevchenko.client.dto.ClientDTO;
import org.shevchenko.client.model.Client;

@Mapper
public interface ClientMapper {

    @Insert("INSERT INTO CLIENT(name, surname, email, password, birth_day) " +
            "VALUES (#{client.name}, #{client.surname}, #{client.email}, #{client.password}, #{client.birthDay})")
    @Options(useGeneratedKeys = true, keyProperty = "client.id", keyColumn = "id")
    void insertClient(@Param("client") Client client);

    @Select("SELECT name, surname, email, password, birth_day as birthDay " +
            "FROM client WHERE id = #{id}")
    ClientDTO getClientById(Long id);

    @Select("SELECT name, surname, email, password, birth_day as birthDay " +
            "FROM client WHERE email = #{email}")
    ClientDTO getClientByEmail(String email);
}
