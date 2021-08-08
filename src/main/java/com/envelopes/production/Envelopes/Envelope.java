package com.envelopes.production.Envelopes;

import com.envelopes.production.Operations.PriorityScale;
import com.envelopes.production.Operations.Scalable;

import javax.persistence.Entity;
import javax.persistence.Id;

import static com.envelopes.production.Operations.PriorityScale.*;

@Entity
public class Envelope implements Scalable {

    @Id
    private int id;

    private String name;
    private String type;
    private double balance;
    private PriorityScale priority;


    public Envelope() {
        this("NO NAME", "NO TYPE", 0.0, NOT_RATED);
    }

    public Envelope(String name, String type, double balance) {
        this(name, type, balance, NOT_RATED);
    }

    public Envelope(String name, String type, double balance, PriorityScale priority) {
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.priority = priority;


    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public PriorityScale getPriority() {
        return priority;
    }


    public Envelope applyPriority(PriorityScale newPriority) {
        return new Envelope(name, type, balance, newPriority);
    }


    @Override
    public Object applyScale(PriorityScale priorityScale) {
        return null;
    }


}
