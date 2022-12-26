package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extra_cheez=false;
    private boolean extra_toppings=false;
    private boolean add_takeAway=false;
    private boolean is_bill_generated=false;
    int chees_price;
    int topping_price;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=300;
        }else{
            this.price=400;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extra_cheez==false){
            this.price+=80;
            extra_cheez=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extra_toppings==false && isVeg==true){
            extra_toppings=true;
            this.price+=70;
        }else
        if(!extra_toppings && !isVeg){
            extra_toppings=true;
            topping_price=120;
            this.price+=topping_price;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(add_takeAway==false){
            add_takeAway=true;
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(is_bill_generated==false) {
            this.bill = "Base Price Of The Pizza: "+this.price + "\n";
            if (extra_cheez == true) {
                bill += "Extra Cheese Added: "+80 + "\n";
            }
            if (extra_toppings = true && isVeg) {
                bill += "Extra Toppings Added: "+70 + "\n";
            }
            if (add_takeAway == true) {
                bill += "Paperbag Added: "+20 + "\n";
            }
            bill += "Total Price: "+price + "\n";
            is_bill_generated=true;
        }
        return this.bill;
    }
}
