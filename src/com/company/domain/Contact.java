package com.company.domain;

import java.io.Serializable;

public class Contact implements Serializable, Entity<Integer> {
    private int Id;
    private String phoneNumber;
    private String email;
    private String Adress;

    public Contact(int id, String phoneNumber, String email, String adress) {
        Id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        Adress = adress;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Id=" + Id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", Adress='" + Adress + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }
}
