package com.envelopes.model;

import javax.persistence.*;

@Entity
@Table(name = "envelope_category")
public class EnvelopeCategory extends Category {

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn("envelope_id")
    private Envelope envelopes;


}
