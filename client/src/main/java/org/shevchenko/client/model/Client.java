package org.shevchenko.client.model;

import manifold.ext.props.rt.api.val;
import manifold.ext.props.rt.api.var;

import java.time.LocalDate;

public class Client {

    @val Long id;

    @var String name;
    @var String surname;
    @var String email;
    @var LocalDate birthDay;

    public Client(Long id) {
        this.id = id;
    }
}
