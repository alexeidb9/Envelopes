//package com.envelopes.production;
//
//
//public class MoneyOperations extends Envelope{
//
//    public double deposit(double amount) {
//
//
//        getEnvelopeBalance() += amount;
//        envelopesHistory.add(String.valueOf("D" + amount));
//        return envelopeBalance;
//
//    }
//
//
//    public double withdraw(double amount) {
//        if (envelopeBalance < amount) {
//            throw new IllegalArgumentException("There are not enough savings in the envelope.");
//        }
//        envelopeBalance -= amount;
//        Envelope.envelopesHistory.add(String.valueOf("W" + amount));
//        return envelopeBalance;
//    }
//
//
//}
