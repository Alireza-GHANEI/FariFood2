package ir.ac.kntu;
import ir.ac.kntu.logic.FruitMarket;
import ir.ac.kntu.logic.FruitMarketDataBase;
import ir.ac.kntu.logic.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderFromFruitMarket {

    private Scanner input = new Scanner(System.in);
    private FruitMarketDataBase fruitMarketDataBase = new FruitMarketDataBase();

    public void continuOrdering(){

        System.out.println("\ntell me the name of fruitMarket you want to order");
        String nameFruitMarket = input.nextLine();
        ArrayList<FruitMarket> fruitMarkets;
        fruitMarkets = fruitMarketDataBase.initialize();

        boolean flag = true;
        for(FruitMarket fruitMarket : fruitMarkets){
            if(fruitMarket.getName().equals(nameFruitMarket)){
                flag = false;
                System.out.println("now tell me the name of fruit chosen :");
                String fruitName = input.nextLine();
                ArrayList<Product> listFruit = fruitMarket.getListOfProduct();
                boolean parcham = true;
                for (Product product : listFruit){
                    if(fruitName.equals(product.getName())){
                        parcham = false;
                        System.out.println("Order registered successfully! we will send it to your address as soon as possible :) \n");
                        break;
                    }
                }
                if(parcham){
                    System.out.println("no such Fruit found , please pay attention and try again...\n");
                    fruitMarketDataBase.showFruitMarket();
                    continuOrdering();

                }
                break;
            }
        }
        if(flag){
            System.out.println("no such FruitMarket found , please pay attention and try again...\n");
            fruitMarketDataBase.showFruitMarket();
            continuOrdering();
        }
    }

}
