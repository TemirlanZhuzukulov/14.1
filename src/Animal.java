public class Animal {
    private int speed;

    public void speed(){
        System.out.println("speed is "+speed+" km/h");
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    public Animal() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                '}';
    }
}
