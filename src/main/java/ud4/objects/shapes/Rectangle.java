package ud4.objects.shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Rectangle(double width, double height) {
        this(0, 0, width, height);
    }

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public boolean contains(double x, double y){
        boolean insideXRange = x >= this.x && x <= (this.x + this.width);
        boolean insideYRange = y >= this.y && y <= (this.y + this.height);
        return insideXRange && insideYRange;
    }
}
