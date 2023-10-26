package org.shevchenko.client.service;

import org.shevchenko.client.dto.ClientDTO;
import org.shevchenko.client.model.Client;

public interface ClientService {


    void insertClient(Client client);

    ClientDTO findClientById(Long id);

    ClientDTO findClientByEmail(String email);
}
