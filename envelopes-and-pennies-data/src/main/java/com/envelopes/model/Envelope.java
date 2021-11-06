package com.envelopes.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Envelopes")
public class Envelope extends BaseEntity {

    @Column(name = "title")
    private String title;

    @ManyToOne
    @Column(name = "type")
    private Category category;

    @Column(name = "balance")
    private Double balance;


    @ManyToOne
    @JoinTable(name = "category",
            joinColumns = @JoinColumn(name = "envelope_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Category categories;



}
