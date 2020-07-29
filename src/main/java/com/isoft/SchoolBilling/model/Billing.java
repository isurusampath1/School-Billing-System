package com.isoft.SchoolBilling.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Billing {

    @Id
    private Integer id;
    private String state;

    @ManyToOne
    @JoinColumn(name = "classid", insertable = false,updatable = false)
    private ClassRoom aClassRoom;
    private String classid;



    public Billing() {
    }

    public Billing(Integer id, String state) {
        this.id = id;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
