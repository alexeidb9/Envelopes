package com.envelopes.exceptions;


public class EnvelopeNotFoundException extends RuntimeException{

    public EnvelopeNotFoundException(Long id) {
        super("Could not find employee " + id);

    }
}
