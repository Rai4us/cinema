package org.shevchenko.configuration.client.dto;

import manifold.ext.props.rt.api.val;
import manifold.ext.props.rt.api.var;

public class LibraryDTO {

    @val Long id;
    @var String str;

    public LibraryDTO(Long id) {
        this.id = id;
    }


}