package ir.ac.kntu.logic;

import java.util.ArrayList;

public class SuperMarket {

    private String name;
    private String address;
    private ArrayList<Product> listOfProduct;

    public SuperMarket(String name,String address, ArrayList<Product> listOfProduct) {
        this.address = address;
        this.listOfProduct = listOfProduct;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getListOfProduct() {
        return listOfProduct;
    }

    @Override
    public String toString() {

        return "name='" + name + '\'' +" , address : " + address + " , list of products : " +
                listOfProduct.toString() + '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
