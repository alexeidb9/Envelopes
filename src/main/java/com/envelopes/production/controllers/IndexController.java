package com.envelopes.production.controllers;


import com.envelopes.production.repositories.EnvelopeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    private final EnvelopeService envelopeService;

    public IndexController(EnvelopeService envelopeService) {
        this.envelopeService = envelopeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("envelopes", envelopeService);

        return "index";}

}
