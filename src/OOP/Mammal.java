package OOP;

/*Create a class "Mammal" with below attributes:
 Hands (default 2)
 Legs (default 2)
 Hair (default value is black)
 wings (default 0)
 Actions:
 walk
 sleep
 drink
 eat
 showAllAttributes
Create 3 creations with below specifications:
 human -> default values
 octopus -> hands=8; legs=0; hair=white
 dog -> hair=brown*/

public class Mammal {

    //attributes
    int hands = 2;
    int legs = 2;
    String hair = "Black";
    int wings = 0;

    //set values
    public void setHands(int hand){

        hands = hand;
    }

    public void setLegs(int leg){

        legs = leg;
    }

    public void setHair(String h){

        hair = h;
    }

    //methods
    public void walk(){
        System.out.println("Animal walks");
    }

    public void sleep(){

        System.out.println("Animal sleeps");
    }
    public void drink(){

        System.out.println("Animal drinks");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void showAllAttributes(){

        System.out.println("hands: " + hands);
        System.out.println("legs: " + legs);
        System.out.println("hair: " + hair);
        System.out.println("wings: " + wings);
    }


    }




