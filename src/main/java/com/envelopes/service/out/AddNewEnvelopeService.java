package com.envelopes.service.out;

import com.envelopes.model.Envelope;


public class AddNewEnvelopeService {

    private Envelope envelope;
    private CalculateAverage calculateAverage;

    public AddNewEnvelopeService(Envelope envelope, CalculateAverage calculateAverage) {
        this.envelope = new Envelope();
        this.calculateAverage = calculateAverage;
    }
}
