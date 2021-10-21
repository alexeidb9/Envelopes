package com.envelopes.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


//@Entity
@Data
public class Category extends BaseModel{

    private String name;
    private String description;

//    @ManyToMany(mappedBy = "categories")
//    private Set<Envelope> envelopes;

    }


