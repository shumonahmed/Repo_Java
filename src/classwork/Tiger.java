package classwork;

public class Tiger extends Animals{
    public Tiger(String name, int i, int size, int weight) {
        super(name, size, weight);
    }
    public void play() {
        System.out.println("Tiger is playing");
    }
    @Override
    public void eat() {
        System.out.println("Eat from child class is called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Child class move is called");
        moveLegs();
        super.move(speed);
    }
    private void moveLegs() {
        System.out.println("Local method move legs is called");
    }

    public void jump(){

        System.out.println("Local method jump is called");
    }

}


