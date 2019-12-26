package com.company.dao;

import com.company.domain.Deposit;

import java.io.File;
import java.io.IOException;

public class DepositeDao extends AbstractDao <Integer, Deposit> {
    public DepositeDao(File file) throws IOException, ClassNotFoundException {
        super(file);
    }
}
