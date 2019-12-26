package com.company.exception;

public class BalanceIsNotEnough extends Exception {
    public BalanceIsNotEnough() {
        super("موجودی کافی نیست");
    }
}
