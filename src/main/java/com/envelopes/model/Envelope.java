package com.envelopes.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Envelopes")
public class Envelope extends BaseEntity {

//    public static final Comparator<Envelope> BY_NAME = comparing(Envelope::getName);
//    public static final Comparator<Envelope> BY_BALANCE = comparing(Envelope::getBalance);

    @Column(name = "title")
    private String title;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Envelope")
    @Column(name = "type")
    private Set<EnvelopeCategory> category = new HashSet<>();

    @Column(name = "balance")
    private Double balance;

    //    @OneToMany(cascade = CascadeType.ALL, mappedBy = "envelope")
//    private List<Notes> notes = new ArrayList<>();

//    @ManyToMany
//    @JoinTable(name = "category",
//            joinColumns = @JoinColumn(name = "envelope_id"),
//            inverseJoinColumns = @JoinColumn(name = "category_id"))
////    private Set<Category> categories;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "envelope")
//    private Set<Category> category;



//    @Override
//    public Object applyScale(PriorityScale priorityScale) {
//        return null;
//    }


}
