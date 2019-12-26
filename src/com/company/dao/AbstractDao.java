package com.company.dao;

import com.company.domain.Entity;
import com.company.exception.AlreadyIsExsist;
import com.company.exception.BalanceIsNotEnough;
import com.company.exception.ItemIsNotFound;

import java.io.*;
import java.util.*;

public abstract class AbstractDao<ID , T extends Entity> {

    private Map<ID, T> cash;
    private final File file;

    protected AbstractDao(File file) throws IOException, ClassNotFoundException {
        cash = new HashMap();
        this.file = file;
        if (!this.file.exists()) {
            this.file.createNewFile();
            writeToFile();
            readFromFile();
        }
    }

    protected void readFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<T> fetch = (ArrayList<T>) ois.readObject();
        for (T item : fetch) {
            cash.put((ID) item.getId(), item);
            ois.close();
            fis.close();
        }
    }

    protected void writeToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ArrayList<T> data = new ArrayList<>(cash.values());
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(data);
        oos.close();
        fos.close();
    }

    public void insert(T item) throws AlreadyIsExsist, IOException {
/*        if (cash.containsKey(item.getId()))
            throw new AlreadyIsExsist();*/
        cash.put((ID) item.getId(), item);
        writeToFile();

    }


    public T getById(ID id) throws ItemIsNotFound, IOException, ClassNotFoundException, BalanceIsNotEnough {
        if (!cash.containsKey(id))
            throw new ItemIsNotFound();
        return cash.get(id);

    }

    public List<T> getAll() {
        return new ArrayList<T>(cash.values());
    }

    public void update(T item) throws ItemIsNotFound, IOException {
/*                if (!cash.containsKey(item.getId()))
                    throw new ItemIsNotFound();*/
                cash.put((ID) item.getId(), item);
                writeToFile();
            }

    public void delete(ID id) throws ItemIsNotFound, IOException {
                if (!cash.containsKey(id))
                    throw new ItemIsNotFound();
                cash.remove(id);
                writeToFile();
    }
}