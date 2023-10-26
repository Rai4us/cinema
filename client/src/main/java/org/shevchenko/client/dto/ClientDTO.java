package org.shevchenko.client.dto;

import manifold.ext.props.rt.api.var;

import java.time.LocalDate;

public class ClientDTO {

    @var
    String name;
    @var
    String surname;
    @var
    String email;
    @var
    LocalDate birthDay;

}
