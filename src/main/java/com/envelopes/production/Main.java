package com.envelopes.production;


public class Main {

    public static void main(String[] args) {
        Envelope budgetEnvelope = new Envelope("General Budget", "General Savings", 1000, PriorityScale.FIVE_STAR);
        Envelope newCameraEnvelope = new Envelope("Fujifilm X-T3", "Items", 1435, PriorityScale.TWO_STAR);
        Envelope emergencyEnvelope = new Envelope("Just In Case", "Emergency Savings", 500, PriorityScale.FOUR_STAR);

        System.out.println(budgetEnvelope.getEnvelopeType() + " " + budgetEnvelope.getEnvelopeBalance() + " " + budgetEnvelope.getPriority().getStars());
        System.out.println(newCameraEnvelope.getName() + " " + newCameraEnvelope.getEnvelopeType() + " " + newCameraEnvelope.getEnvelopeBalance() + " " + newCameraEnvelope.getPriority().getStars());
        System.out.println(emergencyEnvelope.getEnvelopeType() + " " + emergencyEnvelope.getEnvelopeBalance() + " " + emergencyEnvelope.getPriority().getStars());


    }

}