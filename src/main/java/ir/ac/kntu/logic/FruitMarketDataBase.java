package ir.ac.kntu.logic;

import java.util.ArrayList;

public class FruitMarketDataBase {

    public ArrayList<FruitMarket> initialize() {

        ArrayList<FruitMarket> listOfFruits = new ArrayList<>();

        ArrayList<Product> listFruit1 = new ArrayList<>();
        listFruit1.add(new Product("sib",1));
        listFruit1.add(new Product("perteghaal",2));
        listFruit1.add(new Product("mowz",3));
        FruitMarket fruitMarket1 = new FruitMarket("tarebar","ozgol",listFruit1);

        ArrayList<Product> listFruit2 = new ArrayList<>();
        listFruit2.add(new Product("angoor",4));
        listFruit2.add(new Product("golabi",5));
        listFruit2.add(new Product("hendevane",6));
        FruitMarket fruitMarket2 = new FruitMarket("mivesara","pasdaran",listFruit2);

        ArrayList<Product> listFruit3 = new ArrayList<>();
        listFruit3.add(new Product("anar",7));
        listFruit3.add(new Product("narengi",8));
        listFruit3.add(new Product("khiar",9));
        FruitMarket fruitMarket3 = new FruitMarket("miveforushi","tehranpars",listFruit3);

        listOfFruits.add(fruitMarket1);
        listOfFruits.add(fruitMarket2);
        listOfFruits.add(fruitMarket3);

        return listOfFruits;
    }

    public void showFruitMarket() {
        ArrayList<FruitMarket> fruitMarkets = initialize();
        for (FruitMarket fruitMarket : fruitMarkets) {
            System.out.println(fruitMarket);
        }
    }
}
