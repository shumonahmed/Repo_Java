package classwork;

public class Animals {

    private String name;
    private int size;
    private int weight;
    public Animals(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }
    public void eat() {
        System.out.println("Eat from Parent class is called (ANIMAL)");
    }
    public void move(int speed){
        System.out.println("Animal is moving at speed: " + speed);
    }
    public String getName() {
        return name;
    }
}
