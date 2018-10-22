package com.epam.edp.demo.resource;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class DemoResourceImpl implements DemoResource {

    @Override
    public String hello() {
        return "Hello, EDP!";
    }
}
