package java.oop.lab_2_17_7.testthread8;

import java.util.Random;


public class BankTest {

    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) throws InterruptedException {

        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Random random = new Random();
        int numberAccounts = bank.getNumberAccounts();

        for (int i = 0; i < 100; i++) {
            Thread.sleep((int) (100 * Math.random()));
            new Thread(new Transfer(bank, random.nextInt(numberAccounts), random.nextInt(numberAccounts))).start();
        }

    }

}
