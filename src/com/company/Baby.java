package com.company;

public class Baby {
    String name;
     boolean isMale;
     double weight=5.0;
     double decibels;
     int numPoops=1;

    public Baby() {
    }

    void poop(){
       numPoops+=1;
        System.out.println("dear mother,"+ "I have pooped. Ready ther diaper");
    }

    public Baby(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;

    }

    void sayHi(){
        System.out.println("Hi, my name is ..."+ name);
    }

    void eat(double foodWeight){
        if(foodWeight>=0 && foodWeight<weight){
            weight=weight+foodWeight;
        }
    }

}
