package org.shevchenko.client.service.impl;

import io.micrometer.observation.annotation.Observed;
import org.shevchenko.client.dto.ClientDTO;
import org.shevchenko.client.mapper.entity.ClientMapper;
import org.shevchenko.client.model.Client;
import org.shevchenko.client.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Observed(name = "clientService")
@Service("clientService")
public class DefaultClientService implements ClientService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultClientService.class);

    private final ClientMapper clientMapper;


    public DefaultClientService(ClientMapper clientMapper) {
        this.clientMapper = clientMapper;
    }

    @Override
    public void insertClient(Client client) {
        LOGGER.info("New client insertion");
        clientMapper.insertClient(client);
    }

    @Override
    public ClientDTO findClientById(Long id) {
        return clientMapper.getClientById(id);
    }

    @Override
    public ClientDTO findClientByEmail(String email) {
        return clientMapper.getClientByEmail(email);
    }


}
