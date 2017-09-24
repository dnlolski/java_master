package com.OopInheritance;

/**
 * Created by edaolsz on 2017-07-04.
 */
public class OOP_2 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12123143443453",0,"Bib Bob","Bob@bob.com","2343-343-2");

        System.out.println("Initial balance: " + account.getBalance());

        System.out.println("Acc number: " + account.getAccNumber());

        account.addFunds(666);

        System.out.println("Balance after actions: " + account.getBalance());

        account.removeFunds(400);

        System.out.println("Balance after actions: " + account.getBalance());

        account.removeFunds(800);

        System.out.println("Balance after actions: " + account.getBalance());
    }
}
