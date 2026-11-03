package ud4.objects;

public class Robot {
    private double x;
    private double y;
    private double speed;

    public Robot(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        assureSpeedLowerBound();
        assureSpeedUpperBound();
    }

    public Robot(){
        this(0, 0, 1);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate(){
        this.speed += 0.5;
        assureSpeedUpperBound();
    }

    public void deccelerate(){
        this.speed -= 0.5;
        assureSpeedLowerBound();
    }

    public void up(){
        this.y += this.speed;
    }

    private void assureSpeedLowerBound(){
        if (speed < 0.5)
            speed = 0;
    }
    private void assureSpeedUpperBound(){
        if (speed > 10)
            speed = 10;
    }
}
