package com.envelopes.production;

import com.envelopes.production.domain.Envelope;
import com.envelopes.production.Envelopes.EnvelopeManager;
import com.envelopes.production.Operations.PriorityScale;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {


        Envelope budgetEnvelope = new Envelope("General Budget", "General Savings", 1000, PriorityScale.NOT_RATED);
        Envelope newCameraEnvelope = new Envelope("Fujifilm X-T3", "Items", 1435, PriorityScale.TWO_STAR);
        Envelope emergencyEnvelope = new Envelope("Just In Case", "Emergency Savings", 500, PriorityScale.FOUR_STAR);
        EnvelopeManager manager = new EnvelopeManager(Locale.getDefault());

        Envelope p1 = manager.createEnvelope("Retirement","Last Resort", 2000, PriorityScale.NOT_RATED);
        manager.printEnvelopeReport();
    }




}
