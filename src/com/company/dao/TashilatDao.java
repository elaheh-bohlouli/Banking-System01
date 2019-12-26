package com.company.dao;

import com.company.domain.Tashilate;

import java.io.File;
import java.io.IOException;

public class TashilatDao extends AbstractDao<Integer, Tashilate>{
    public TashilatDao(File file) throws IOException, ClassNotFoundException {
        super(file);
    }
}
