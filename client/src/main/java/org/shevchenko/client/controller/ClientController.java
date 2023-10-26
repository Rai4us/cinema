package org.shevchenko.client.controller;

import org.shevchenko.client.dto.ClientDTO;
import org.shevchenko.client.mapper.dto.ClientDTOMapper;
import org.shevchenko.client.model.Client;
import org.shevchenko.client.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/client")
public record ClientController(
        ClientService clientService,
        ClientDTOMapper clientDTOMapper
) {

    private final static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    @PostMapping("/create")
    public ClientDTO createClient(@RequestBody Client client) {
        LOGGER.info(client.birthDay.toString());
        clientService.insertClient(client);
        return clientDTOMapper.clientToClientDTO(client);
    }

    @GetMapping("/find/{clientId}")
    public ClientDTO createClient(@PathVariable Long clientId) {
        LOGGER.info("Trying to find a customer with an id: {}", clientId);
        return clientService.findClientById(clientId);
    }

    @GetMapping("/find")
    public ClientDTO createClient(@RequestBody String clientEmail) {
        LOGGER.info("Trying to find a customer with an email: {}", clientEmail);
        return clientService.findClientByEmail(clientEmail);
    }
}
