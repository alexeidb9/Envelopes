package com.envelopes.production.exceptions;

public class EnvelopeNotFoundException extends Throwable{

    public EnvelopeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
