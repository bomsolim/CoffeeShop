//package project because it's in my project directory 
package project;

import java.util.ArrayList;


public class Menu {
    private ArrayList<Coffee> coffee = new ArrayList<Coffee>();
    private ArrayList<Coffee> tea = new ArrayList<Coffee>();
    private ArrayList<Coffee> specials = new ArrayList<Coffee>();

    //constructor for the coffee
    public Menu() {
        addtoMenu();
    }

//adding stuff to the menu
    public void addtoMenu() {
        coffee.add(new Coffee("Cappucino", 5.50, "Coffee"));
        coffee.add(new Coffee("Latte", 4.50,"Coffee"));
        coffee.add(new Coffee("Macchiato", 5.60,"Coffee"));
        coffee.add(new Coffee("Frappe", 5.80,"Coffee"));
        coffee.add(new Coffee("Irish Coffee",7.20,"Coffee"));
        coffee.add(new Coffee("Mocha",3.20,"Coffee"));
        coffee.add(new Coffee("Turkish Coffee",4.20,"Coffee"));
        coffee.add(new Coffee("Iced Coffee",6.30,"Coffee"));
        coffee.add(new Coffee("Espresso",5.20,"Coffee"));
        coffee.add(new Coffee("Late Macchiato",6.20,"Coffee"));
        coffee.add(new Coffee("Bulletproof Coffee",6.20,"Coffee"));
        
        //tea
        tea.add(new Coffee("Tea",6.32,"Tea"));
        tea.add(new Coffee("Green Tea",6.25,"Tea"));
        tea.add(new Coffee("Iced Tea",6.55,"Tea"));

        //specials
        specials.add(new Coffee("Im Special",6.50,"Specials"));
        specials.add(new Coffee("Im Classic",6.84,"Specials"));

    }
//getting how many coffee and etc there are in the menu
    public int getCoffeeSize() {
        return coffee.size();
    }
    public int getTeaSize() {
        return tea.size();
    }
    public int getSpecialsSize(){
        return specials.size();
    }
    public String getAllCoffee() {
        String menu1 = "";
        menu1 += "Coffee: ";
        for (int i = 0; i <coffee.size(); i++) {
            Coffee c = coffee.get(i);
            menu1+="A" + (i+1) + " " + c.toString() + "\n";
        }
        return menu1;
    }
    public String getAllSpecials() {
        String menu2 = "";
        menu2 += "Specials: ";
        for (int i = 0; i <specials.size(); i++) {
            Coffee c = specials.get(i);
            menu2+="B" + (i+1) + " " + c.toString() + "\n";
        }
        return menu2;
    }
    public String getAllTea() {
        String menu3 = "";
        menu3 += "Tea: ";
        for (int i = 0; i <tea.size(); i++) {
            Coffee c = tea.get(i);
            menu3+="C" + (i+1) + " " + c.toString() + "\n";
        }
        return menu3;
    }
    //creating a combination of the list
    public String toString() {
        String menu = "";
        menu += "Im Coffee\n";

        menu += getAllCoffee() + "\n";
        menu += getAllTea() + "\n";
        menu += getAllSpecials() + "\n";
        return menu;
    }

}
