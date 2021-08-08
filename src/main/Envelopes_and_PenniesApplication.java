package com.alxndrpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Envelopes_and_PenniesApplication {
    public static void main(String[] args) {
        SpringApplication.run(Envelopes_and_PenniesApplication.class, args);

        Patient patient = new Patient();
        Appointment appointment = new Appointment();

        Util util = new Util();
        util.getConnection("ss","ss");




    }
}





