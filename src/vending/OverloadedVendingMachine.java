package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {
    private int softdrinkQty = 0;
    private int chocolateQty = 10;
    private int saltySnackQty = 6;




    void buy(SoftDrink softdrink){
        if (softdrinkQty > 0) {
            softdrinkQty--;
        }else {
           System.out.println("Out of stock");
        }

    }
   void buy(SaltySnack saltySnack){
        if (softdrinkQty > 0) {
            saltySnackQty--;
        }else {
            System.out.println("Out of stock");
        }
    }

    void buy(Chocolate chocolate){
        chocolateQty --;
    }
    void buy(Product product){
        if (softdrinkQty > 0) {
            softdrinkQty -= 3;
            saltySnackQty -= 3;
            chocolateQty -= 3;
        }else {
            System.out.println("Out of stock");
        }
    }


    void addStock(SoftDrink softdrink){
        softdrinkQty += 1;

    }
    void addStock(SaltySnack saltySnack){
        saltySnackQty += 1;
    }
    void addStock(Chocolate chocolate){
        chocolateQty += 1;
    }
    void addStock(Product product){
        softdrinkQty += 1;
        saltySnackQty += 1;
        chocolateQty += 1;
    }


    int getStock(SoftDrink softdrink){
       return softdrinkQty;
    }
    int getStock(SaltySnack saltySnack){
        return saltySnackQty;
    }
    int getStock(Chocolate chocolate){
        return chocolateQty;
    }
    int getStock(){
        return chocolateQty + softdrinkQty + softdrinkQty;

    }

    public static void main(String[] args) {
        

    }



}
