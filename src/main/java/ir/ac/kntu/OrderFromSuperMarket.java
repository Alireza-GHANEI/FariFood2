package ir.ac.kntu;
import ir.ac.kntu.logic.SuperMarket;
import ir.ac.kntu.logic.Product;
import ir.ac.kntu.logic.SuperMarketDataBase;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderFromSuperMarket {

    private Scanner input = new Scanner(System.in);
    private SuperMarketDataBase superMarketDataBase = new SuperMarketDataBase();

    public void continuOrdering(){

        System.out.println("\ntell me the name of superMarket you want to order");
        String nameSuperMarket = input.nextLine();
        ArrayList<SuperMarket> superMarkets;
        superMarkets = superMarketDataBase.initialize();

        boolean flag = true;
        for(SuperMarket superMarket : superMarkets){
            if(superMarket.getName().equals(nameSuperMarket)){
                flag = false;
                System.out.println("now tell me the name of product chosen :");
                String superName = input.nextLine();
                ArrayList<Product> listSuper = superMarket.getListOfProduct();
                boolean parcham = true;
                for (Product product : listSuper){
                    if(superName.equals(product.getName())){
                        parcham = false;
                        System.out.println("Order registered successfully! we will send it to your address as soon as possible :) \n");
                        break;
                    }
                }
                if(parcham){
                    System.out.println("no such Super found , please pay attention and try again...\n");
                    superMarketDataBase.showSuperMarket();
                    continuOrdering();

                }
                break;
            }
        }
        if(flag){
            System.out.println("no such SuperMarket found , please pay attention and try again...\n");
            superMarketDataBase.showSuperMarket();
            continuOrdering();
        }
    }
}
