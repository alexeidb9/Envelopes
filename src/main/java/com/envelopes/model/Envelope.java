package com.envelopes.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
public class Envelope extends BaseModel  {

//    public static final Comparator<Envelope> BY_NAME = comparing(Envelope::getName);
//    public static final Comparator<Envelope> BY_BALANCE = comparing(Envelope::getBalance);

    private String name;
    private String type;
    private Double balance;

//    @Enumerated(value = EnumType.STRING)
//    private PriorityScale priorityScale;


//    @Lob
//    @Column(name = "photo", columnDefinition = "BLOB")
//    private byte[] image;

//
//    @ManyToMany
//    @JoinTable(name = "category",
//            joinColumns = @JoinColumn(name = "envelope_id"),
//            inverseJoinColumns = @JoinColumn(name = "category_id"))
//    private Set<Category> categories;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "envelope")
//    private Set<Category> category;

//    @OneToOne(cascade = CascadeType.ALL)
//    private Notes notes;

//    @Override
//    public Object applyScale(PriorityScale priorityScale) {
//        return null;
//    }


}
