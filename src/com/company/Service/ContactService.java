package com.company.Service;

import com.company.dao.ContactDao;
import com.company.domain.Contact;
import com.company.exception.AlreadyIsExsist;
import java.io.IOException;

public class ContactService {
    private final IdGenrator idGenrator;
    private final ContactDao contactDao;

    public ContactService(ContactDao contactDao) {
        idGenrator = new IdGenrator();
        idGenrator.prepare(contactDao);
        this.contactDao = contactDao;
    }
    public Contact register(Contact contact) throws AlreadyIsExsist, IOException {
        contact.setId(idGenrator.nextId(IdGenrator.Entity.CONTANT));
        contactDao.insert(contact);
        return contact;
    }
}
