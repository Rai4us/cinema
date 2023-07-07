package org.shevchenko.client.repository;

import org.apache.ibatis.annotations.Insert;
import org.shevchenko.client.model.Client;

public interface ClientRepository {

    @Insert(
       "INSERT INTO clients(id, name, surname, email, dateOfBirth) " +
       "VALUES ()")
    public Long save(Client client);
}
