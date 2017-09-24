package com.OopInheritance;

public class BankAccount {

    private String accNumber;
    private int balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accNumber, int balance, String customerName, String email,
                       String phoneNumber) {
        System.out.println("Account constractor with parameters called");
        this.accNumber=accNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void setAccNumber(String accNumber){
        this.accNumber=accNumber;
    }
    public String getAccNumber(){
        return this.accNumber;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int addFunds(int addFunds){
        balance=+addFunds;
        //System.out.println("Your balance after addition: " + this.balance);
        return this.balance;
    }
    public int removeFunds(int removeFunds){
        if(this.balance<removeFunds){
            System.out.println("Too low funds");
        }else{
            balance= balance - removeFunds;
            //System.out.println("Your balance afther withdrawal: " + this.balance);
        }
        return this.balance;
    }
}
