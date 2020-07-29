package com.isoft.SchoolBilling.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClassRoom {

    @Id
    private String className;
    private String termFee;
    private String securityFee;



    public ClassRoom() {
    }

    public ClassRoom(String className, String termFee, String securityFee) {
        this.className = className;
        this.termFee = termFee;
        this.securityFee = securityFee;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTermFee() {
        return termFee;
    }

    public void setTermFee(String termFee) {
        this.termFee = termFee;
    }

    public String getSecurityFee() {
        return securityFee;
    }

    public void setSecurityFee(String securityFee) {
        this.securityFee = securityFee;
    }
}
