package project;

import java.util.ArrayList;
//class constructor of declaring a coffee
public class Coffee {
    private static final String COMPANY = "Im Coffee";
    private String name;
    private double price;
    private String drink;
    private ArrayList<String> ingredients = new ArrayList<String>();

    public Coffee() {

    }
//public constructor in which a coffee contains
    public Coffee(String name, double price, String drink) {
        this.name = name;
        this.price = price;
        this.drink = drink;
    }
//setting the name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getDrink() {
        return drink;
    }

    public void setDrink(char type) {
        switch(type) {
            case 'C': drink = "C";
            case 'T': drink = "T";
            case 'S': drink = "S";
        }
    }
//setting the price
    public void setPrice(double price) {
        this.price = price;
    }
//addding the ingredients to the arraylist
    public void addIngredients() {
        ingredients.add("Milk Foam");
        ingredients.add("Steamed Milk");
        ingredients.add("Espresso");
    }
    public String getCompany() {
        return COMPANY;
    }
    //creating a way to check the ingredients of the coffee
    public String checkIngredients() {
        String str = "Ingredients: ";
        for (String i:ingredients) {
        str += i + ", ";
        }
        return str;
    }
//creating a way so that the name and price can be shown
    public String toString() {
        return name + "\t" + price + "\t" +drink;
    }
}
