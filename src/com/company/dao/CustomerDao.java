package com.company.dao;

import com.company.domain.Customer;

import java.io.File;
import java.io.IOException;

public class CustomerDao extends AbstractDao<Integer, Customer> {

    public CustomerDao(File file) throws IOException, ClassNotFoundException {
        super(file);
    }
}
