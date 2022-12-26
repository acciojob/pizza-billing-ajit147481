package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extra_cheez=false;
    private boolean extra_toppings=false;
    private boolean add_takeAway=false;
    private boolean is_bill_generated=false;
    private int chees_price;
    private int topping_price;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        this.chees_price=80;
        if(isVeg==true){
            this.price=300;
            this.topping_price=70;
        }else{
            this.price=400;
            this.topping_price=120;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extra_cheez==false){
            this.price+=this.chees_price;
            this.extra_cheez=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extra_toppings==false){
            this.extra_toppings=true;
            this.price+=this.topping_price;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(add_takeAway==false){
            this.add_takeAway=true;
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(is_bill_generated==false) {
            this.bill = "Base Price Of The Pizza: "+this.price + "\n";
            if (extra_cheez == true) {
                bill += "Extra Cheese Added: "+chees_price + "\n";
            }
            if (extra_toppings = true && isVeg) {
                bill += "Extra Toppings Added: "+topping_price + "\n";
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
