package org.shevchenko.client.model;

import manifold.ext.props.rt.api.var;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Client {

    @var Long id;
    @var String name;
    @var String surname;
    @var String email;
    @var String password;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @var LocalDate birthDay;

}
