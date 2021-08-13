package com.envelopes.production.domain;

import com.envelopes.production.Operations.Scalable;
import lombok.Data;

import javax.persistence.*;

import java.util.Set;

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

    //private "difficulty"

    // Large object
    @Lob
    private Byte[] image;
    // We want the envelope to own it, so we use a cascade type and we will persist all operations. making also envelope a target property on
//    donation class


    // Ordinal is default (1,2,3), String - will get a string value out of enum.
    @Enumerated(value = EnumType.STRING)
    private PriorityScale priorityScale;

    @ManyToMany
    //specifying, naming the table (envelope_category)
    @JoinTable(name = "envelope_category",
            joinColumns = @JoinColumn(name = "envelope_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;

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
