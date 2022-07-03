package ir.ac.kntu.logic;
import ir.ac.kntu.Enums.CostLevel;
import ir.ac.kntu.logic.Food;
import ir.ac.kntu.logic.Restaurant;
import ir.ac.kntu.logic.Time;
import java.util.ArrayList;
import java.util.HashMap;

public class RestaurantDatabase {

    public ArrayList<Restaurant> initialization() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        String[] comment11 = new String[1];String[] comment12 = new String[0];String[] comment13 = new String[0];
        String[] comment21 = new String[2];String[] comment22 = new String[0];String[] comment23 = new String[1];
        String[] comment31 = new String[0];String[] comment32 = new String[1];String[] comment33 = new String[3];
        String[] comment41 = new String[1];String[] comment42 = new String[1];String[] comment43 = new String[0];
        String[] comment51 = new String[0];String[] comment52 = new String[0];String[] comment53 = new String[1];
        comment11[0] = "OMG!";comment21[0]="incredible";comment21[1] ="bahbah";comment23[0] ="good";comment32[0] ="vay";
        comment33[0] ="bad";comment33[1] ="hmm";comment33[2] ="No";comment41[0] ="laziz";comment42[0] ="waoh";
        comment53[0] ="ah";

        HashMap<Food, Integer> menu1 = new HashMap<>();
        menu1.put(new Food("kabab", "goosht bare,berenj", 4.0, comment11),37);
        menu1.put(new Food("jooje", "goosht goosfand,berenj tarom", 4.3, comment12), 40);
        menu1.put(new Food("shishlig", "goosht laziz,mokhalafat", 2.3, comment13), 50);
        Restaurant restaurant1 = new Restaurant("choloSara","tehran,yaftAbad",new Time(11,30),
                new Time(23,59), CostLevel.ECONOMIC,menu1);
        HashMap<Food, Integer> menu2 = new HashMap<>();
        menu2.put(new Food("peperoni", "panir,sossis", 3.6, comment21), 70);
        menu2.put(new Food("makhloot", "kalbas,panir gooda", 4.7, comment22), 63);
        menu2.put(new Food("makhsoos", "goosht gorbe :3,mokhalafat", 1.3, comment23), 17);
        Restaurant restaurant2 = new Restaurant("pitzaSara", "tehran,khaniabad",
                new Time(11, 0), new Time(22, 10), CostLevel.LUXURY, menu2);
        HashMap<Food, Integer> menu3 = new HashMap<>();
        menu3.put(new Food("bandari", "sosis jonub,sos makhsus", 2.9, comment31), 10);
        menu3.put(new Food("felafel", "nokhod a'alaa,salad", 3.6, comment32), 15);
        menu3.put(new Food("koktel", "hamberger ,kahoo", 1.7, comment33), 20);
        Restaurant restaurant3 = new Restaurant("pitzaSara", "tehran,yakhchiabad",
                new Time(12, 0), new Time(22, 35), CostLevel.NORMAL, menu3);
        HashMap<Food, Integer> menu4 = new HashMap<>();
        menu4.put(new Food("hommos", "Al nokhod,Al khoshmaze tarkibiat", 4.1, comment41), 70);
        menu4.put(new Food("fetush", "nemidanam,aard but art", 4.2, comment42), 64);
        menu4.put(new Food("mokabbaa", "etelaa'ee nadaram,vali khoshmazas", 3.9, comment43), 38);
        Restaurant restaurant4 = new Restaurant("lebaneseRestaurant", "karaj,km 8",
                new Time(10, 45), new Time(22, 55), CostLevel.LUXURY, menu4);
        HashMap<Food, Integer> menu5 = new HashMap<>();
        menu5.put(new Food("fesenjoon", "gerdoo hamedan ,robe anaar saave", 5.0, comment51), 18);
        menu5.put(new Food("kalepache", "pache goosfand,banagoosh", 5.0, comment52), 18);
        menu5.put(new Food("chelomorgh", "morgh,berenj,salad,nooshaabaa", 5.0, comment53), 18);
        Restaurant restaurant5 = new Restaurant("baabaataaher", "hamedan",
                new Time(5, 0), new Time(24, 0), CostLevel.ECONOMIC, menu5);

        restaurants.add(restaurant1);restaurants.add(restaurant2);restaurants.add(restaurant3);
        restaurants.add(restaurant4);restaurants.add(restaurant5);
        return restaurants;
    }

    public void showRestaurant(){
        ArrayList<Restaurant> restaurants = initialization();
        Time currentTime = new Time(22, 11);
        for (Restaurant restaurant : restaurants) {
            if (restaurant.active(currentTime)) {
                System.out.println(restaurant);
            }
        }
    }
}


