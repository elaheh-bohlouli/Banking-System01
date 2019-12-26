package com.company.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Deposit implements Serializable, Entity {


    protected enum withdrowCondition{SHOBE, KART, INTERNET}
    protected Integer Id;
    protected final String name;
    protected long balance;
    protected final Date openDate;
    public ArrayList<Customer> depositCustomers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return Objects.equals(Id, deposit.Id) &&
                Objects.equals(name, deposit.name) &&
                Objects.equals(balance, deposit.balance) &&
                Objects.equals(openDate, deposit.openDate) &&
                Objects.equals(depositCustomers, deposit.depositCustomers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, balance, openDate, depositCustomers);
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", openDate=" + openDate +
                ", depositCustomers=" + depositCustomers +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public ArrayList<Customer> getDepositCustomers() {
        return depositCustomers;
    }

    public void setDepositCustomers(ArrayList<Customer> depositCustomers) {
        this.depositCustomers = depositCustomers;
    }

    public Deposit(Integer id, String name, long balance, Date openDate, ArrayList<Customer> depositCustomers) {
        Id = id;
        this.name = name;
        this.balance = balance;
        this.openDate = openDate;
        this.depositCustomers = depositCustomers;
    }

    public Deposit(Integer id, String name, Date openDate) {
        Id = id;
        this.name = name;
        this.openDate = openDate;
    }
}
