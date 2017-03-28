package com.codeclan.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.vendingmachine.Coins.DIME;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestMachine{
    Machine machine;


    @Before
    public void before(){
      machine = new Machine(0, true);
    }


    @Test
    public void test_machine_on() {
        assertEquals(true, machine.isOn());
    }

    @Test
    public void test_balance_zero(){
        assertEquals(0, machine.getBalance());

    }


    @Test
    public void test_enum_dime(){
        machine.acceptCoin(Coins.DIME);
        assertEquals(10, machine.getBalance());
    }

    @Test
    public void test_enum_dime_and_dollar(){
        machine.acceptCoin(Coins.DIME);
        machine.acceptCoin(Coins.DOLLAR);
        assertEquals(110, machine.getBalance());
    }



//    @Test
//    public void test_nickel(){
//        machine.nickel();
//        assertEquals(5, machine.getBalance());
//    }
//
//    @Test
//    public void test_dime(){
//        machine.dime();
//        assertEquals(10, machine.getBalance());
//    }
//
//    @Test
//    public void test_quarter(){
//        machine.quarter();
//        assertEquals(25, machine.getBalance());
//    }
//
//    @Test
//    public void test_dollar(){
//        machine.dollar();
//        assertEquals(100, machine.getBalance());
//    }

//    @Test
//    public void test_counting(){
//        machine.nickel();
//        machine.dollar();
//        assertEquals(105, machine.getBalance());
//    }
}