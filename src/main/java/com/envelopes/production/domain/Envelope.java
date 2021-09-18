package com.envelopes.production.domain;

import com.envelopes.production.Operations.Scalable;
import lombok.Data;

import javax.persistence.*;

import java.util.Set;


/*Assignment - Display a list of Envelopes
- Add any needed Unit Of Measure to data.sql
- Use Bootstrap class to create envelopes on startup
- create service to return envelope list to controller
- pass list to Thymeleaf view to display on index page


* */

@Data
@Entity
public class Envelope implements Scalable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private Double balance;

    public Envelope() {

    }

    @Enumerated(value = EnumType.STRING)
    private PriorityScale priorityScale;


//    // Large object
//    @Lob
//    @OneToOne(cascade = CascadeType.ALL)
//    private byte[] image;
//    /* We want the envelope to own it, so we use a cascade type and
//    we will persist all operations. (making also envelope a target property on donation class) */



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

    public Envelope(String name, String envelopeType, double envelopeBalance, PriorityScale priority) {
    }



//    private Transaction transaction;


    @Override
    public Object applyScale(PriorityScale priorityScale) {
        return null;
    }


}
