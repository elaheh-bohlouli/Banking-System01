package com.company;

import com.company.Service.DepositService;
import com.company.dao.CustomerDao;
import com.company.dao.DepositeDao;
import com.company.dao.TashilatDao;
import com.company.domain.*;
import com.company.exception.AlreadyIsExsist;
import com.company.exception.BalanceIsNotEnough;
import com.company.exception.ItemIsNotFound;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {
            CustomerDao customerDao = new CustomerDao(new File("F:\\New folder (2)\\Customer.data"));
            DepositeDao depositeDao = new DepositeDao(new File("F:\\New folder (2)\\Deposit.data"));
            TashilatDao tashilatDao = new TashilatDao(new File("F:\\New folder (2)\\Tashilat.data"));

            Contact contactcostomer1 = new Contact(1, "09106805348", "eli.bohlouli@yahoo.com",
                    "ArmaghanehGharbi");

            ArrayList<Customer> arrayList = new ArrayList<>(3);

            arrayList.add(new Customer(contactcostomer1, 1, "elaheh", "bohlouli", "Firouz", "3755656298", new Date(),
                    new Date(), "Iran", "Karmand"));
            arrayList.add(new Customer(contactcostomer1, 2, "elaheh", "bohlouli", "Firouz", "3755656298", new Date(),
                    new Date(), "Iran", "Karmand"));
            arrayList.add(new Customer(contactcostomer1, 3, "elaheh", "bohlouli", "Firouz", "3755656298", new Date(),
                    new Date(), "Iran", "Karmand"));

            LongTimeDeposit longTimeDeposit = new LongTimeDeposit(2, "eladeposit", 10000l, new Date(), arrayList);
            depositeDao.insert(longTimeDeposit);

            DepositService depositService = new DepositService(depositeDao, longTimeDeposit);
            depositService.variz(55l);
            depositeDao.update(longTimeDeposit);
            depositService.bardasht(100l);
            depositeDao.update(longTimeDeposit);
            Deposit byId = depositeDao.getById(2);
            System.out.println(byId);
            

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (ItemIsNotFound itenNotFound) {
            itenNotFound.printStackTrace();
        } catch (AlreadyIsExsist alreadyIsExsist) {
            alreadyIsExsist.printStackTrace();
        } catch (BalanceIsNotEnough balanceIsNotEnough) {
            balanceIsNotEnough.printStackTrace();
        }
    }
}