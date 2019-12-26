package com.company.Service;

import com.company.dao.CustomerDao;
import com.company.domain.Customer;
import com.company.exception.AlreadyIsExsist;

import java.io.IOException;

public class CustomerService {
    private final IdGenrator idGenrator;
    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        idGenrator = new IdGenrator();
        idGenrator.prepare(customerDao);
        this.customerDao = customerDao;
    }
    public Customer register(Customer customer) throws AlreadyIsExsist, IOException {
        customer.setId(idGenrator.nextId(IdGenrator.Entity.CUSTOMER));
        customerDao.insert(customer);
        return customer;
    }
}
