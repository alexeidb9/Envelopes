package com.envelopes.production.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    // This is going to be on a join table, an the categories is going to be this property's name.
    @ManyToMany(mappedBy = "categories")
    private Set<Envelope> envelopes;




}
