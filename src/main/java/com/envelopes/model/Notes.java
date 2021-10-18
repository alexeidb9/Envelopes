package com.envelopes.model;

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
    private String budgetNotes;


}
