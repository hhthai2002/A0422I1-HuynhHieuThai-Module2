package exercise;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: radius = " + getRadius() + " and color is " + getColor();
    }
}
