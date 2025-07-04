package com.learning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int sRollNo;
    private String sName;
    private int sAge;
    private String sAddress;

    // Constructors
    public Student() {
    }
    public Student(int sRollNo, String sName, int sAge, String sAddress) {
        this.sRollNo = sRollNo;
        this.sName = sName;
        this.sAge = sAge;
        this.sAddress = sAddress;
    }

    // Getters and setters
    public int getsRollNo() {
        return sRollNo;
    }

    public void setsRollNo(int sRollNo) {
        this.sRollNo = sRollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    // toString Method
    @Override
    public String toString() {
        return "Student{" +
                "sRollNo=" + sRollNo +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}
