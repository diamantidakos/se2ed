package com.mgiandia.se2ed.ch13.p03factories.s01staticconstructors;

import java.util.Currency;




public class Money {

    private int amount;
    private Currency currency;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public static Money euros(int amount) {
        return new Money(amount, Currency.getInstance("EUR"));
    }

    public static Money dollars(int amount) {
        return new Money(amount, Currency.getInstance("USD"));
    }
    
}
