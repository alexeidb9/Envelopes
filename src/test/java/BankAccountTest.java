//package com.company.alxndr.pro;
//import static junit.framework.TestCase.fail;
//import static junit.framework.TestCase.assertEquals;
//import static junit.framework.TestCase.assertTrue;
//
//public class BankAccountTest {
//
//    private BankAccount account;
//    private static int count;
//
//    @org.junit.BeforeClass
//    public static void beforeClass() {
//        System.out.println("This executes before any test cases" + count++);
//    }
//
//
//    @org.junit.Before
//
//    public void setup() {
//        BankAccount account = new BankAccount("Alexei", "Al", 6000.00, BankAccount.CHECKING);
//        System.out.println("Running a test");
//
//    }
//
//    @org.junit.Test
//    public void deposit() throws Exception {
//        double balance = account.deposit(4000.00, true);
//        assertEquals(10000.00, balance, 0);
//    }
//
//    @org.junit.Test
//    public void withdraw_branch() throws Exception {
//        double balance = account.withdraw(600.00, true);
//        assertEquals(400.00,balance,0);
//    }
//
//    @org.junit.Test (expected = IllegalArgumentException.class)
//    public void withdraw_NotBranch() throws Exception {
//        account.withdraw(600.00, false);
//        fail("sould have thrown exception");
//    }
//
//    @org.junit.Test
//    public void getBalance_deposit() throws Exception {
//        account.deposit(4000.00, true);
//        assertEquals(10000.00, account.getBalance(), 0);
//    }
//
//    @org.junit.Test
//    public void getBalance_withdraw() throws Exception {
//        account.withdraw(4000.00, true);
//        assertEquals(2000.00, account.getBalance(), 0);
//
//
//    }
//
//    @org.junit.Test
//    public void isChecking_true() {
//        assertTrue("This account is not checking account", account.isChecking());
//
//    }
//
//    @org.junit.AfterClass
//    public static void afterClass () {
//        System.out.println("This executes after any test cases" + count++);
//    }
//
//    @org.junit.After
//    public void tearDown() {
//        System.out.println("Count = " + count++);
//    }
//
//}
