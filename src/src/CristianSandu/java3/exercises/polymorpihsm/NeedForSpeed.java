package CristianSandu.java3.exercises.polymorpihsm;

public class NeedForSpeed {

    private int speed;
    private int battery;

    public NeedForSpeed() {
        System.out.println("Calling default constructor");
    }

    public NeedForSpeed(int speed, int battery) {
        this.speed = speed;
        this.battery = battery;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
