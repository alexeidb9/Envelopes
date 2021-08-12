package com.envelopes.production.domain;

import com.envelopes.production.Operations.PriorityScale;
import com.envelopes.production.Operations.Scalable;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import java.util.Set;

import static com.envelopes.production.Operations.PriorityScale.*;

@Data
@Entity
public class Envelope implements Scalable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Long datatype is commonf for id value. (integer has it's limits)
    private Long id;

    private String name;
    private String type;
    private Double balance;
    private PriorityScale priority;

    //private "difficulty"

    // Large object
    @Lob
    private Byte[] image;
    // We want the envelope to own it, so we use a cascade type and we will persist all operations. making also envelope a target property on
//    donation class

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "envelope")
    private Set<Donation> donation;


    //todo add

    // Makes this entity an owner of Notes. (If we delete Envelope it going to persist down
    // and delete Notes - conversely if we delete the Notes object, the Envelope will remain in database)

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

//    private Transaction transaction;


    @Override
    public Object applyScale(PriorityScale priorityScale) {
        return null;
    }


}
