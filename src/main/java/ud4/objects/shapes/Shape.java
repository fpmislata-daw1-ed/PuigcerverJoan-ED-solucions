package ud4.objects.shapes;

public abstract class Shape {
    protected double x;
    protected double y;

    protected Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPosition(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean contains(double x, double y);
}
