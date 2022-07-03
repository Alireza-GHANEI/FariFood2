package ir.ac.kntu.logic;
import java.util.ArrayList;

public class SuperMarketDataBase {

    public ArrayList<SuperMarket> initialize() {

        ArrayList<SuperMarket> listOfSupers = new ArrayList<>();

        ArrayList<Product> listSuper1 = new ArrayList<>();
        listSuper1.add(new Product("toneMahi",1));
        listSuper1.add(new Product("chips",2));
        listSuper1.add(new Product("pogak",3));
        SuperMarket superMarket1 = new SuperMarket("ahmadi","niavaran",listSuper1);

        ArrayList<Product> listSuper2 = new ArrayList<>();
        listSuper2.add(new Product("rob",4));
        listSuper2.add(new Product("bastani",5));
        listSuper2.add(new Product("sefidKonande",6));
        SuperMarket superMarket2 = new SuperMarket("khaleghi","shariati",listSuper2);

        ArrayList<Product> listSuper3 = new ArrayList<>();
        listSuper3.add(new Product("kalbas",7));
        listSuper3.add(new Product("gharch",8));
        listSuper3.add(new Product("oloviye",9));
        SuperMarket superMarket3 = new SuperMarket("kamrani","kamraniye",listSuper3);

        listOfSupers.add(superMarket1);
        listOfSupers.add(superMarket2);
        listOfSupers.add(superMarket3);

        return listOfSupers;
    }

    public void showSuperMarket() {
        ArrayList<SuperMarket> superMarkets = initialize();
        for (SuperMarket superMarket : superMarkets) {
            System.out.println(superMarket);
        }
    }
}

