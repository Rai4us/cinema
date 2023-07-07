package org.shevchenko.client.controller;

import org.shevchenko.configuration.client.dto.LibraryDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/library")
public class LibraryController {

    @GetMapping
    public LibraryDTO getAllLibraries() {
        LibraryDTO library = new LibraryDTO(1L);
//        new LibraryDTO().backendProp =
        return null;
    }
}
