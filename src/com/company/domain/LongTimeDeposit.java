package com.company.domain;


import java.util.ArrayList;
import java.util.Date;

public class LongTimeDeposit  extends Deposit {

    public LongTimeDeposit(Integer id, String name, long balance, Date openDate, ArrayList<Customer> depositCustomers) {
        super(id, name, balance, openDate, depositCustomers);
    }

    public LongTimeDeposit(Integer id, String name, Date openDate) {
        super(id, name, openDate);
    }
}
