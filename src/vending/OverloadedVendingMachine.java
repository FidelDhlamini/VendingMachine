package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {
    private int softdrinkQty;
    private int chocolateQty;
    private int saltySnackQty;




    public void buy(SoftDrink softdrink){
        if (softdrinkQty > 0) {
            softdrinkQty--;
        }else {
           System.out.println("Out of stock");
        }

    }
   public void buy(SaltySnack saltySnack){
        if (softdrinkQty > 0) {
            saltySnackQty--;
        }else {
            System.out.println("Out of stock");
        }
    }

    public void buy(Chocolate chocolate){
        chocolateQty --;
    }
    public void buy(Product product){
        if (softdrinkQty > 0) {
            softdrinkQty -= 3;
            saltySnackQty -= 3;
            chocolateQty -= 3;
        }else {
            System.out.println("Out of stock");
        }
    }
    OverloadedVendingMachine(int softDrinkLvl, int saltySnacksLvl, int chocolatesLvl){
        // set the stockLevel instance variables for each product in the constructor
          softdrinkQty = softDrinkLvl;
          saltySnackQty = saltySnacksLvl;
          chocolateQty = chocolatesLvl;
    }


    public void addStock(SoftDrink softdrink){
        softdrinkQty += 1;

    }
   public void addStock(SaltySnack saltySnack){
        saltySnackQty += 1;
    }
   public void addStock(Chocolate chocolate){
        chocolateQty += 1;
    }
   public void addStock(Product product){
        softdrinkQty += 1;
        saltySnackQty += 1;
        chocolateQty += 1;
    }


    public int getStock(SoftDrink softdrink){
       return softdrinkQty;
    }
    public int getStock(SaltySnack saltySnack){
        return saltySnackQty;
    }
   public int getStock(Chocolate chocolate){
        return chocolateQty;
    }
    public int getStock(){
        return chocolateQty + softdrinkQty + softdrinkQty;

    }

    public static void main(String[] args) {
        OverloadedVendingMachine vendingMach = new OverloadedVendingMachine(4,6,10);
        vendingMach.addStock(new SaltySnack());
        vendingMach.getStock(new SaltySnack());
        vendingMach.buy(new SaltySnack());
        vendingMach.buy(new SaltySnack());
        vendingMach.buy(new SaltySnack());
        vendingMach.buy(new Chocolate());
        System.out.println(vendingMach.getStock(new SaltySnack()));
        System.out.println(vendingMach.getStock(new Chocolate()));

        

    }



}
