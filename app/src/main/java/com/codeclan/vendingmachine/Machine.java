package com.codeclan.vendingmachine;

/**
 * Created by user on 28/03/2017.
 */

public class Machine {

    int balance;
    boolean isOn;
    Coins coin;

    public Machine(int balance, boolean isOn) {
        this.balance = balance;
        this.isOn = isOn;
    }

    public int getBalance() {
        return balance;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setOn(boolean on) {
        isOn = on;
    }

    public void acceptCoin(Coins coin){
        int value = coin.getValue();
        balance += value;
    }

//    public void nickel(){
//        balance += 5;
//    }
//
//    public void dime(){
//        balance += 10;
//    }
//
//    public void quarter(){
//        balance += 25;
//    }
//
//    public void dollar(){
//        balance += 100;
//    }
}
