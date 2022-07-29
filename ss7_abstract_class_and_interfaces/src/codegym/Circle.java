package codegym;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void howToColor(){
        System.out.print("Color all sides");
    }
    @Override
    public void resize(int percent) {
        this.radius = this.radius + percent * this.radius / 100;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle before size increasing with radius = "
                + getRadius()
                + ", area = "
                + getArea()
                + " and perimeter = "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

}
