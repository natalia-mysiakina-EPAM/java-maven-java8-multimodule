package com.epam.edp.demo.resource;


import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Roman_Martseniuk
 */
public interface HelloEdpResource {

    @GetMapping(value = "/resource/hello")
    String hello();
}
