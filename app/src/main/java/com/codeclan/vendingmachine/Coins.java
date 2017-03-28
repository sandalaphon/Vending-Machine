package com.codeclan.vendingmachine;

import static android.R.attr.value;

/**
 * Created by user on 28/03/2017.
 */

public enum Coins {
    NICKEL(5),
    DIME(10),
    QUARTER(25),
    DOLLAR(100);

    private int value;

    Coins( int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
