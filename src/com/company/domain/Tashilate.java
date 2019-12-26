package com.company.domain;

import java.io.Serializable;

public class Tashilate implements Serializable, Entity<Integer> {
    public enum tashilatType{THREEMOUNT, SIXMOUNTH, ONEYEAR }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    @Override
    public String toString() {
        return "Tashilate{" +
                "id=" + id +
                ", deposit=" + deposit +
                '}';
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public Tashilate(int id, Deposit deposit) {
        this.id = id;
        this.deposit = deposit;
    }

    private final Deposit deposit;

}
