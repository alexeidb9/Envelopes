package com.envelopes.production.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Envelope envelope;

    @Lob
    // For large objects. (Blob - binary large objects, etc.)
    private String budgetNotes;


}
