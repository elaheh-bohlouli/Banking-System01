package com.company.domain;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable, Entity<Integer> {
    private enum customerType{REALCUSTOMER, LEAGALCUSTOMER, PUBLICCUSTOMER}
    private final Contact contact;
    private  int id;
    private final String name;
    private final String family;
    private final String fatherName;
    private final String nationalCod;
    private final Date creatCustomer;
    private final Date bornDate;
    private final String country;
    private String job;

    public Customer(Contact contact, int id, String name, String family, String fatherName, String nationalCod,
                    Date creatCustomer, Date bornDate, String country, String job) {
        this.contact = contact;
        this.id = id;
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.nationalCod = nationalCod;
        this.creatCustomer = creatCustomer;
        this.bornDate = bornDate;
        this.country = country;
        this.job = job;
    }

    public Customer(Contact contact, int id, String name, String family, String fatherName, String nationalCod,
                    Date creatCustomer, Date bornDate, String country) {
        this.contact = contact;
        this.id = id;
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.nationalCod = nationalCod;
        this.creatCustomer = creatCustomer;
        this.bornDate = bornDate;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "contact=" + contact +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", nationalCod='" + nationalCod + '\'' +
                ", creatCustomer=" + creatCustomer +
                ", bornDate=" + bornDate +
                ", country='" + country + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getNationalCod() {
        return nationalCod;
    }

    public Date getCreatCustomer() {
        return creatCustomer;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public String getCountry() {
        return country;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
