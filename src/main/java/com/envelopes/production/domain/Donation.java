package com.envelopes.production.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recipientsName;
    private BigDecimal amount;

    // fetch Eager - is a default behaviour, but it is useful to explicitely show an intent.
    //meaning it will be retrieved everytime from the database
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;


    @ManyToOne
    private Envelope envelope;





}
