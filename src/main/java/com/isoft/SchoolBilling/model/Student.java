package com.isoft.SchoolBilling.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String admissionNumber;
    private String firstName;
    private String lastName;
    private String fullName;
    private String gender;
    private String address;
    private String guardianName;
    private String guardingTP;

    @ManyToOne
    @JoinColumn(name = "classRoom_id", updatable = false)
    private ClassRoom classRoom;

    public Student() {
    }

    public Student(int id, String admissionNumber,
                   String firstName, String lastName,
                   String fullName, String gender, String address,
                   String guardianName, String guardingTP, ClassRoom classRoom) {
        this.id = id;
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.guardianName = guardianName;
        this.guardingTP = guardingTP;
        this.classRoom = classRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
