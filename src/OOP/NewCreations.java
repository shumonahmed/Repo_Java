package OOP;

public class NewCreations {

    public static void main(String[] args) {

        Mammal human = new Mammal();
        System.out.println("Human: ");
        human.showAllAttributes();

        Mammal octopus = new Mammal();
        octopus.setHands(8);
        octopus.setLegs(0);
        octopus.setHair("White");
        System.out.println("\nOctopus: ");
        octopus.showAllAttributes();

        Mammal dog = new Mammal();
        dog.setHair("brown");
        System.out.println("\ndogs: ");
        dog.showAllAttributes();
    }


}

