package com.company.dao;

import com.company.domain.Contact;
import java.io.File;
import java.io.IOException;

public class ContactDao extends AbstractDao<Integer, Contact> {
    protected ContactDao(File file) throws IOException, ClassNotFoundException {
        super(file);
    }
}
