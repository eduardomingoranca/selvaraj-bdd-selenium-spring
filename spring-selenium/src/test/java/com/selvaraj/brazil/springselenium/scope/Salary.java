package com.selvaraj.brazil.springselenium.scope;

import org.springframework.stereotype.Component;

@Component
public class Salary {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
