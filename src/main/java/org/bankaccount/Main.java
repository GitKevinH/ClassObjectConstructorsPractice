package org.bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Kevin H", 500);
        bankAccount.deposit(100);
        bankAccount.printDetails();

        System.out.println("---------------------"); // to separate 1st requirement from 2nd requirement

        //Bank Transfer requirements

        BankAccount bankAccount1 = new BankAccount("John J", 5000);
        BankAccount bankAccount2 = new BankAccount("Richard R", 300);

        bankAccount1.withdrawl(100);
        bankAccount2.deposit(100);

        bankAccount1.printDetails();
        System.out.println(); // line break
        bankAccount2.printDetails();

        System.out.println("---------------------"); // to separate 2nd requirement from 3rd requirement

        //Product requirements

        Product skittles = new Product(2.5, 30,"Skittles");
        skittles.printProduct();
        skittles.totalCost();


    }
}
