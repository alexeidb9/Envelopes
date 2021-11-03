package com.envelopes.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@MappedSuperclass
public class Category extends BaseEntity {

    @Column(name = "name");
    private String name;


    }


