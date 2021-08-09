package com.envelopes.production.domain;

import com.envelopes.production.Operations.PriorityScale;
import com.envelopes.production.Operations.Scalable;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import static com.envelopes.production.Operations.PriorityScale.*;

@Data
@Entity
public class Envelope implements Scalable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private Double balance;
    private PriorityScale priority;

    //private "difficulty"

    // Large object
    @Lob
    private Byte[] image;


    //todo add
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

//    private Transaction transaction;

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


    public Envelope applyPriority(PriorityScale newPriority) {
        return new Envelope(name, type, balance, newPriority);
    }


    @Override
    public Object applyScale(PriorityScale priorityScale) {
        return null;
    }


}
