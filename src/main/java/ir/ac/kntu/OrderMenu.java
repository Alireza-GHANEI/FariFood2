package ir.ac.kntu;
import ir.ac.kntu.logic.FruitMarketDataBase;
import ir.ac.kntu.logic.RestaurantDatabase;
import ir.ac.kntu.logic.SuperMarketDataBase;

import java.util.Scanner;

public class OrderMenu {

    private Scanner input = new Scanner(System.in);
    private RestaurantDatabase restaurantDatabase = new RestaurantDatabase();
    private OrderFromRestaurant orderFromRestaurant = new OrderFromRestaurant();
    private FruitMarketDataBase fruitMarketDataBase = new FruitMarketDataBase();
    private OrderFromFruitMarket orderFromFruitMarket = new OrderFromFruitMarket();
    private SuperMarketDataBase superMarketDataBase = new SuperMarketDataBase();
    private OrderFromSuperMarket orderFromSuperMarket = new OrderFromSuperMarket();
    private MainMenu mainMenu = new MainMenu();
    public void run(){

        System.out.println("from which section do you want to order?" +
                "\n1.Restaurant  2.FruitMarket  3.SuperMarket     4.back");
        int entryNumber = input.nextInt();
        input.nextLine();

        switch (entryNumber){
            case 1:
                System.out.println("\nAvailable restaurants for now are...\n");
                restaurantDatabase.showRestaurant();
                orderFromRestaurant.continueOrdering();
                break;
            case 2:
                System.out.println("\nFruitMarkets are...\n");
                fruitMarketDataBase.showFruitMarket();
                orderFromFruitMarket.continuOrdering();
                break;
            case 3:
                System.out.println("\nSuperMarkets are...\n");
                superMarketDataBase.showSuperMarket();
                orderFromSuperMarket.continuOrdering();
                break;
            case 4:
                callAgainMainMenu();
            default:
                System.out.println("Incorrect input,you have to choose between 1,2,3 or 4. Try again...");
                run();

        }
        ending();
    }

    public void ending(){
        System.out.println("\nAny other Order ?   1.Yes,please   2.No,thanks ");
        int number = input.nextInt();
        input.nextLine();
        switch (number) {
            case 1:
                mainMenu.run();
                break;
            case 2:
                System.out.println("thanks for choosing our program. Hope to see you again ^_^");
                System.exit(0);
            default:
                System.out.println("You have to choose between 1 and 2 ! ");
                ending();
        }
    }

    public void callAgainMainMenu() {
        MainMenu mainmenu = new MainMenu();
        mainmenu.costumerMenu();
    }


}
