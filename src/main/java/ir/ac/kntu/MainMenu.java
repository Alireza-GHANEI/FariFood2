package ir.ac.kntu;
import ir.ac.kntu.logic.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    
    MainMenu(){

    }

    private Scanner input = new Scanner(System.in);
    private ArrayList<Costumer> costumerList = new ArrayList<>();

    public void run() {

        OrderMenu orderMenu = new OrderMenu();

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to FariFood2 ^_^\nAre you 1.Admin or 2.Costumer ?           3.Exit program" +
                "\nChoose between numbers:");
        int entryNumber = input.nextInt();
        switch (entryNumber) {
            case 1:
                input.nextLine();
                adminMenu();
                break;
            case 2:
                input.nextLine();
                costumerMenu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("wrong entry,you have to choose whether 1,2 or 3");
                input.nextLine();
                run();
        }
    }

    public void adminMenu(){
        System.out.println("Are you 1.program administrator, 2.Restaurant admin, 3.superMarket admin or" +
                " 4.fruitMarket admin ?     5.back\nChoose correspond number:");
        int entryNumber = input.nextInt();
        switch (entryNumber) {
            case 1:
                input.nextLine();
                programAdminMenu();
                break;
            case 2:
                input.nextLine();
                restaurantAdminMenu();
                break;
            case 3:
                input.nextLine();
                superMarketAdminMenu();
                break;
            case 4:
                input.nextLine();
                fruitMarketAdminMenu();
                break;
            case 5:
                input.nextLine();
                run();
            default:
                System.out.println("wrong entry,you have to choose between 1,2,3,4 or 5.\n");
                input.nextLine();
                adminMenu();
        }
    }

    private void superMarketAdminMenu() {
        Admin admin = new Admin("adminSuperMarket","1234");
        SuperMarketDataBase superMarketDataBase = new SuperMarketDataBase();
        System.out.println("enter your username");
        String username = input.nextLine();
        System.out.println("enter your password");
        String password = input.nextLine();
        if(admin.verifyAdmin(username,password)){
            System.out.println(superMarketDataBase.initialize().toString());
            System.out.println("choose your superMarket index starting from 0");
            int num = input.nextInt();
            input.nextLine();
            System.out.println("want you to change name of your SuperMarket? 1.yes  2.no");
            int number = input.nextInt();
            input.nextLine();
            if(number==1) {
                System.out.println("enter new name");
                String newName = input.nextLine();
                superMarketDataBase.initialize().get(num).setName(newName);
                System.out.println("name changed! going back to MainMenu...");
                run();
            }
            if(number==2){
                System.out.println("going back to MainMenu");
                run();
            }
        }
    }

    private void fruitMarketAdminMenu() {
        Admin admin = new Admin("adminFruitMarket","1234");
        FruitMarketDataBase fruitMarketDataBase = new FruitMarketDataBase();
        System.out.println("enter your username");
        String username = input.nextLine();
        System.out.println("enter your password");
        String password = input.nextLine();
        if(admin.verifyAdmin(username,password)){
            System.out.println(fruitMarketDataBase.initialize().toString());
            System.out.println("choose your restaurant index starting from 0");
            int num = input.nextInt();
            input.nextLine();
            System.out.println("want you to change name of your FruitMarket? 1.yes  2.no");
            int number = input.nextInt();
            input.nextLine();
            if(number==1) {
                System.out.println("enter new name");
                String newName = input.nextLine();
                fruitMarketDataBase.initialize().get(num).setName(newName);
                System.out.println("name changed! going back to MainMenu...");
                run();
            }
            if(number==2){
                System.out.println("going back to MainMenu");
                run();
            }
        }
    }

    private void restaurantAdminMenu() {

        Admin admin = new Admin("adminResto","1234");
        RestaurantDatabase restaurantDatabase = new RestaurantDatabase();
        System.out.println("enter your username");
        String username = input.nextLine();
        System.out.println("enter your password");
        String password = input.nextLine();
        if(admin.verifyAdmin(username,password)){
            System.out.println(restaurantDatabase.initialization().toString());
            System.out.println("choose your restaurant index starting from 0");
            int num = input.nextInt();
            input.nextLine();
            System.out.println("want you to change name of your restaurant? 1.yes  2.no");
            int number = input.nextInt();
            input.nextLine();
            if(number==1) {
                System.out.println("enter new name");
                String newName = input.nextLine();
                restaurantDatabase.initialization().get(num).setName(newName);
                System.out.println("name changed! going back to MainMenu...");
                run();
            }
            if(number==2){
                System.out.println("going back to MainMenu");
                run();
            }
        }
    }

    private void programAdminMenu() {

        Admin admin = new Admin("@alireza","1234");
        System.out.println("enter your username");
        String username = input.nextLine();
        System.out.println("enter your password");
        String password = input.nextLine();
        if(admin.verifyAdmin(username,password)){
            System.out.println("here you are all costumer registered...");
            System.out.println(costumerList.toString());
            System.out.println("want you to remove a costumer ? if yes enter 1 else enter 0");
            int num = input.nextInt();
            input.nextLine();
            if(num==1){
                System.out.println("enter index number of costumer starting from 0");
                int index = input.nextInt();
                input.nextLine();
                costumerList.remove(index);
                System.out.println("costumer index " + index +" removed!");
                run();
            }
            if(num==0){
                run();
            }
        }else{
            System.out.println("Access denied !! *_*");
            System.exit(0);
        }
    }

    public void costumerMenu(){

        System.out.println("\n1.register   2.log in   3.back");
        int entryNumber = input.nextInt();
        switch (entryNumber) {
            case 1:
                input.nextLine();
                costumerRegister();
                break;
            case 2:
                input.nextLine();
                costumerLogin();
                break;
            case 3:
                input.nextLine();
                run();
                break;
            default:
                input.nextLine();
                System.out.println("wrong entry,you have to choose between 1,2 or 3.\n");
                costumerMenu();
        }
    }

    public void costumerLogin() {

        OrderMenu orderMenu = new OrderMenu();
        System.out.println("Enter your username:");
        String username = input.nextLine();
        boolean flag=true;
        int i=0;
        for(Costumer c : costumerList){
            if(c.getUsername().equals(username)){
                System.out.println("Enter your password:");
                String password = input.nextLine();
                if(password.equals(c.getPassword())){
                    orderMenu.run();
                    flag=false;
                }else{
                    System.out.println("Password incorrect,try again...");
                    costumerLogin();
                }
            }
            i++;
        }
        if(i==costumerList.size() && flag) {
            System.out.println("No such username found,you have to register! Going back to costumer Menu... ");
            costumerMenu();
        }
    }

    public void costumerRegister() {

        System.out.println("Enter your first name:");
        String firstName = input.nextLine();
        System.out.println("Enter your last name:");
        String lastName = input.nextLine();
        System.out.println("Enter your address:");
        String address = input.nextLine();
        System.out.println("Enter your telephone number:");
        int telNumber = input.nextInt();
        input.nextLine();
        System.out.println("choose an username:");
        String username = input.nextLine();
        System.out.println("choose a password");
        String password = input.nextLine();
        System.out.println("registered successfully!  Now,going back to costumer menu...");
        Costumer costumer = new Costumer();
        costumer.setFirstName(firstName);
        costumer.setLastName(lastName);
        costumer.setAddress(address);
        costumer.setTelnumber(telNumber);
        costumer.setUsername(username);
        costumer.setPassword(password);
        costumerList.add(costumer);
        costumerMenu();
    }

    public static void main(String[] args) {
        MainMenu mainmenu = new MainMenu();
        mainmenu.run();
    }
}
