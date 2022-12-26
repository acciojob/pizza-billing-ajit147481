package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extra_cheez=false;
    private boolean extra_toppings=false;
    private boolean add_takeAway=false;
    private int total=0;
    private boolean is_bill_generated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=300;
            this.total=price;
        }else{
            this.price=400;
            this.total=price;
        }
        // your code goes here
    }

    public int getPrice(){

        return this.total;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extra_cheez==false){
            this.total+=80;
            extra_cheez=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extra_toppings==false && isVeg==true){
            extra_toppings=true;
            this.total+=70;
        }else
        if(!extra_toppings && !isVeg){
            extra_toppings=true;
            this.total+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(add_takeAway==false){
            add_takeAway=true;
            this.total+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(is_bill_generated==false) {
            this.bill = "Base Price Of The Pizza: " + getPrice() + "\n";
            if (extra_cheez == true) {
                bill += "Extra Cheese Added: " + 80 + "\n";
            }
            if (extra_toppings = true && isVeg) {
                bill += "Extra Toppings Added: " + 70 + "\n";
            } else if (extra_toppings) {
                bill += "Extra Toppings Added: " + 120 + "\n";
            }
            if (add_takeAway == true) {
                bill += "Paperbag Added: " + 20 + "\n";
            }
            bill += "Total Price: " + total + "\n";
            return this.bill;
        }
        return null;
    }
}
