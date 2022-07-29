package codegym;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    @Override
    public void resize(int percent) {
        this.width = this.width + percent * this.width / 100;
        this.length = this.length + percent * this.length / 100;
    }

    @Override
    public void howToColor() {
        super.howToColor();
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle before size increasing with width = "
                + getWidth()
                + " and length = "
                + getLength()
                + " and area = "
                + getArea()
                + " and perimeter = "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}