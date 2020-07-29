package com.isoft.SchoolBilling.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private String admissionNumber;
    private String firstName;
    private String lastName;
    private String fullName;
    private String className;
    private String gender;
    private String address;
    private String guardianName;
    private String guardingTP;

    @ManyToOne
    @JoinColumn(name = "classid", insertable = false, updatable = false)
    private ClassRoom aClassRoom;
    private String classid;

    @OneToOne
    @JoinColumn(name = "billingid",insertable = false,updatable = false)
    private Billing billing;
    private Integer billingid;

    public Student() {
    }

    public Student(String admissionNumber, String firstName, String lastName, String fullName, String className, String gender, String address, String guardianName, String guardingTP) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.className = className;
        this.gender = gender;
        this.address = address;
        this.guardianName = guardianName;
        this.guardingTP = guardingTP;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardingTP() {
        return guardingTP;
    }

    public void setGuardingTP(String guardingTP) {
        this.guardingTP = guardingTP;
    }
}
