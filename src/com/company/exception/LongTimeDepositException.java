package com.company.exception;

public class LongTimeDepositException extends Exception {

    public LongTimeDepositException() {
        super("سپرده بلند مدت اجازه واریز ندارد.");
    }
}
