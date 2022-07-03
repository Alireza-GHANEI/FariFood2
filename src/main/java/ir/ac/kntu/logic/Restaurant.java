package ir.ac.kntu.logic;
import ir.ac.kntu.Enums.CostLevel;
import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String address;
    private Time startWorkTime,endWorkTime;



    private CostLevel costLevel;
    private HashMap<Food,Integer> menu;

    public Restaurant(String name, String address, Time startWorkTime, Time endWorkTime, CostLevel costLevel,
            HashMap<Food, Integer> menu) {
        this.name = name;
        this.address = address;
        this.startWorkTime = startWorkTime;
        this.endWorkTime = endWorkTime;
        this.costLevel = costLevel;
        this.menu = menu;
    }


    public HashMap<Food, Integer> getMenu() {
        return menu;
    }

    public int getCommentNumbers(){

        int numbers = 0;
        for(int i=0;i<this.getFood().size();i++){
            numbers += this.getFood().get(i).getComment().length;
        }
        return numbers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getFood(){
        ArrayList<Food> foods = new ArrayList<>();
        for(Food food : menu.keySet()) {
            foods.add(food);
        }

        return  foods;
    }

    public Restaurant() {

    }

    public boolean active(Time currentTime) {
        if (startWorkTime.getHour() < currentTime.getHour() && currentTime.getHour() < endWorkTime.getHour()) {
            return true;
        }
        if (startWorkTime.getHour() > currentTime.getHour() || currentTime.getHour() > endWorkTime.getHour()) {
            return false;
        }
        if (startWorkTime.getHour() == currentTime.getHour()) {
            return startWorkTime.getMinute() < currentTime.getMinute();
        }
        if (currentTime.getHour() == endWorkTime.getHour()) {
            return endWorkTime.getMinute() > currentTime.getMinute();
        }
        return true;
    }

    public double scoreRestaurant() {

        double score = 5.0;
        double change = 0;
        for(Food food : menu.keySet()){
            change += food.getRate();
        }
        score = change/menu.size();
        return score;
    }

    @Override
    public String toString() {

        String string = "";
        for (HashMap.Entry<Food,Integer> entry : menu.entrySet()) {
            string += entry.getKey().toString() + " , price :" + entry.getValue() + " } {";
        }
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' + "\n" +
                ", startWorkTime=" + startWorkTime +
                ", endWorkTime=" + endWorkTime + "\n" +
                ", costLevel=" + costLevel +
                " , rate of this restaurant is : " + this.scoreRestaurant() +
                ", menu : {" + string +
                '}' + "\n\n";
    }
}
