package com.envelopes.production;

import com.envelopes.production.domain.Envelope;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Envelopes_and_PenniesApplication {
    public static void main(String[] args) {
        SpringApplication.run(Envelopes_and_PenniesApplication.class, args);

        // Use spring boot to create envelopes on startup
        Envelope envelope = new Envelope();


    }
}





