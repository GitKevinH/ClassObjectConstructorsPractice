package org.bankaccount;

public class Product {
    double cost;
    int quantity;
    String prodName;

    public Product(double cost, int quantity, String prodName) {
        this.cost = cost;
        this.quantity = quantity;
        this.prodName = prodName;
    }

    public void totalCost(){
        System.out.println("The total cost of the purchase is: $"+(this.cost*this.quantity));

    }

    public  void printProduct(){
        System.out.println("A single unit of " + this.prodName + " costs $ " + this.cost + " and " + this.quantity + " were purchased." );
    }
}
