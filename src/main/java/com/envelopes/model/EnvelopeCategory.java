package com.envelopes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "envelope_category")
public class EnvelopeCategory extends Category {

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Envelope> envelopes;


}
