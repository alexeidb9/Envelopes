package com.envelopes.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends BaseModel {

    private String name;

    public Role() {

    }

    public Role(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
