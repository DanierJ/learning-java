package com.danjerous;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }


    @org.junit.Before
    public void setup() {
        account = new BankAccount("Dan", "Jav", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
       // fail("This is test has yet to be implemented.");
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception{
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException.");
    }

    @org.junit.Test
    public void withdraw_branch() {
     //  fail("This is test has yet to be implemented.");
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);

    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true () {
        assertTrue("The account is NOT a checking account.", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("Count = " + count++);
    }


    /*@org.junit.Test
    public void dummyTest() {
        assertEquals(20, 20);
    }*/

}