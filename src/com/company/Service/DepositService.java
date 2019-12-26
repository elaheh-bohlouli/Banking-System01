package com.company.Service;

import com.company.dao.DepositeDao;
import com.company.domain.Deposit;
import com.company.exception.AlreadyIsExsist;
import com.company.exception.BalanceIsNotEnough;
import com.company.exception.ItemIsNotFound;

import java.io.IOException;

public class DepositService {
    private final IdGenrator idGenrator;
    private final DepositeDao depositeDao;
    private final Deposit deposit;

    public DepositService(DepositeDao depositeDao, Deposit deposit) {
        idGenrator = new IdGenrator();
        idGenrator.prepare(depositeDao);
        this.depositeDao = depositeDao;
        this.deposit = deposit;
    }
    public Deposit register(Deposit deposit) throws AlreadyIsExsist, IOException {
        deposit.setId(idGenrator.nextId(IdGenrator.Entity.DEPOSIT));
        depositeDao.insert(deposit);
        return deposit;
    }

    public void variz(long mablagh) throws IOException, ItemIsNotFound {
        long newbalance = deposit.getBalance();
        newbalance = newbalance + mablagh;
        deposit.setBalance(newbalance);
        depositeDao.update(deposit);
    }

    public void bardasht(long mablagh) throws IOException, ItemIsNotFound, BalanceIsNotEnough {
        if (mablagh<deposit.getBalance()){
        long newbalance = deposit.getBalance();
        newbalance = newbalance - mablagh;
        deposit.setBalance(newbalance);
        depositeDao.update(deposit);}
        else throw new BalanceIsNotEnough();
    }
}
