package ir.ac.kntu;
import ir.ac.kntu.logic.Admin;
import ir.ac.kntu.logic.Restaurant;
import ir.ac.kntu.logic.RestaurantDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class VerifyAdmin {

    private Admin admin = new Admin("a","1");
    void verificationAdmin(){

        Scanner input = new Scanner(System.in);
        System.out.println("Hello to Farifood program ^_^ .\n\nTo start, please enter admin username ");
        String user = input.nextLine();
        System.out.println("Now enter your password and it's done");
        String pass = input.nextLine();

        if (admin.verifyAdmin(user, pass)){
            System.out.println("Loading All Menus ...\n\n\n1. Order menu\n2. Setting menu\n3. Delivery menu\n" +
                    "4. Restaurant menu\n\n Choose which menu you want by entering its number : ... ");
        }else{
            System.out.println("Access denied ! please first verify your username & password and then" +
                    " try again in below...\n  ");
            verificationAdmin();
        }
        callMenus();
    }

    void selectSorting(ArrayList<Restaurant> restaurants){
        System.out.println("Enter sorting type" + "\n\n" + "1.By Ascending rate of restaurant\n"+"2.By Descending rate of restaurant");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Sort sort = new Sort();

        switch (number){
            case 1 :
                sort.sortRestaurantAscendingScore();
                break;
            case 2 :
                sort.sortRestaurantDescendingScore();
                break;
            default:
                System.out.println("please enter these numbers {1 or 2 } .");
                selectSorting(restaurants);
        }
    }//

    void callMenus(){

        RestaurantDatabase restaurantDatabase = new RestaurantDatabase();
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number){
            case 1 :
                System.out.println("1");//order menu
                break;
            case 2 :
                System.out.println("2");//setting
                break;
            case 3 :
                System.out.println("3");//delivery
                break;
            case 4 :
                restaurantDatabase.showRestaurant();//restaurants menu
                selectSorting(restaurantDatabase.initialization());
                break;
            default :
                System.out.println("Invalid !! , Choose betwen these for numbers only {1,2,3,4}");
        }
    }
}
