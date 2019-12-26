package com.company.Service;

import com.company.dao.TashilatDao;
import com.company.domain.Tashilate;
import com.company.exception.AlreadyIsExsist;
import java.io.IOException;
import java.util.Scanner;

public class TashilatService {
    private final Tashilate tashilate;
    private final IdGenrator idGenrator;
    private final TashilatDao tashilatDao;

    public TashilatService(Tashilate tashilate, TashilatDao tashilatDao) {
        this.tashilate = tashilate;
        idGenrator = new IdGenrator();
        idGenrator.prepare(tashilatDao);
        this.tashilatDao = tashilatDao;
    }

    public Tashilate register(Tashilate tashilate) throws AlreadyIsExsist, IOException {
        tashilate.setId(idGenrator.nextId(IdGenrator.Entity.TASHILAT));
        tashilatDao.insert(tashilate);
        return tashilate;
    }
}
