package org.shevchenko.client.mapper.dto;


import org.mapstruct.Mapper;
import org.shevchenko.client.dto.ClientDTO;
import org.shevchenko.client.model.Client;

@Mapper(componentModel = "spring")
public interface ClientDTOMapper {

    ClientDTO clientToClientDTO(Client client);

    Client clientDTOToClient(ClientDTO clientDTO);
}
