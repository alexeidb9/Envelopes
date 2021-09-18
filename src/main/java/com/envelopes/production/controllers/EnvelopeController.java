package com.envelopes.production.controllers;

import com.envelopes.production.repositories.EnvelopeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/envelope")
public class EnvelopeController {


    @Autowired
    private EnvelopeRepository envelopeRepository;

    @GetMapping
    public Iterable findAll () {
        return envelopeRepository.findAll();
    }

    @GetMapping
    public List findByName (String name) {
        return envelopeRepository.findByName(name);
    }



}
