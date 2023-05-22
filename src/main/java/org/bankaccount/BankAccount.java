package org.bankaccount;


public  class BankAccount {
    double balance;
    String name;

    public BankAccount(String name,double balance) {
        this.name = name;
        this.balance = balance;

    }

    //deposit
    public void deposit(double depAmount){
        this.balance += depAmount;

    }

    //withdrawal
    public void withdrawl(double wdrlAmount){
        this.balance -= wdrlAmount;
    }
    //printDetails
    public void printDetails(){
        System.out.println("Customer Name: "+this.name);
        System.out.println("Account balance: "+this.balance);
    }

}
