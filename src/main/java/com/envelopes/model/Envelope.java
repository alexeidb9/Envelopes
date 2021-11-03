package com.envelopes.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Envelopes")
public class Envelope extends BaseEntity {

//    public static final Comparator<Envelope> BY_NAME = comparing(Envelope::getName);
//    public static final Comparator<Envelope> BY_BALANCE = comparing(Envelope::getBalance);

    @Column(name = "title")
    private String title;

    @ManyToOne
    @Column(name = "type")
    private EnvelopeCategory category;

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
