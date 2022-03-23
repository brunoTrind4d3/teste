package com.trindade.microservices.rest.controller;

import com.trindade.microservices.domain.entity.Person;
import com.trindade.microservices.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/api/v1/secure")
public class Controller {

    @Autowired
    PersonService service;

    @GetMapping("user/{id}")
    public Person getName(@RequestHeader String authorization, @PathVariable String id){
        return this.service
        		.getPersonById(id);
    }
}

