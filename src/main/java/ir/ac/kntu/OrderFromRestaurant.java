package ir.ac.kntu;
import ir.ac.kntu.logic.Food;
import ir.ac.kntu.logic.Restaurant;
import ir.ac.kntu.logic.RestaurantDatabase;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderFromRestaurant {

    private RestaurantDatabase restaurantDatabase = new RestaurantDatabase();
    private Scanner input = new Scanner(System.in);
    public void continueOrdering(){

        ArrayList<Restaurant> listOfResto = new ArrayList<>();
        System.out.println("\nSo first,tell me the name of restaurant you want to order:");
        String entrynameRestaurant = input.nextLine();
        listOfResto = restaurantDatabase.initialization();

        boolean flag = true;
        for(Restaurant resto : listOfResto){

            if(resto.getName().equals(entrynameRestaurant)){
                flag = false;
                System.out.println("now tell me the name of food chosen :");
                String entrynameFood = input.nextLine();
                ArrayList<Food> listFood = resto.getFood();
                boolean parcham = true;
                for (Food food : listFood){
                    if(entrynameFood.equals(food.getName())){
                        parcham = false;
                        System.out.println("Order registered successfully! we will send it to your address as soon as possible :) ");
                        break;
                    }
                }
                if(parcham){
                    System.out.println("no such food found , please pay attention and try again...\n");
                    restaurantDatabase.showRestaurant();
                    continueOrdering();
                }
                break;
            }
        }
        if(flag){
            System.out.println("no such restaurant found , please pay attention and try again...\n");
            restaurantDatabase.showRestaurant();
            continueOrdering();
        }
    }
}
