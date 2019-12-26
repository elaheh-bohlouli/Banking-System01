package com.company.Service;

import com.company.dao.*;
import com.company.domain.*;

import java.util.HashMap;
import java.util.Map;

public class IdGenrator {

    public enum Entity {CUSTOMER, DEPOSIT, TASHILAT, CONTANT}
    private final Map<Entity, Integer> idMap;
    public IdGenrator() {
        idMap = new HashMap<>();
    }

    public void prepare(CustomerDao customerDao){
        int maxId=0;
        for (Customer customer : customerDao.getAll()) {
            if (customer.getId()>maxId){
                maxId = customer.getId();
            }
        }
        maxId++;
        idMap.put(Entity.CUSTOMER, maxId);
        }

    public void prepare(DepositeDao depositeDao){
        int maxId=0;
        for (Deposit deposit : depositeDao.getAll()) {
            if (deposit.getId()>maxId){
                maxId = deposit.getId();
            }
        }
        maxId++;
        idMap.put(Entity.DEPOSIT, maxId);
    }


    public void prepare(TashilatDao tashilatDao){
        int maxId=0;
        for (Tashilate tashilat : tashilatDao.getAll()) {
            if (tashilat.getId()>maxId){
                maxId = tashilat.getId();
            }
        }
        maxId++;
        idMap.put(Entity.TASHILAT, maxId);
    }

    public void prepare(ContactDao contactDao){
        int maxId=0;
        for (Contact contact : contactDao.getAll()) {
            if (contact.getId()>maxId){
                maxId = contact.getId();
            }
        }
        maxId++;
        idMap.put(Entity.CONTANT, maxId);
    }


    public Integer nextId(Entity entity){
        Integer integer = idMap.get(entity);
        integer +=1;
        idMap.put(entity, integer);
        return integer;

    }
}

