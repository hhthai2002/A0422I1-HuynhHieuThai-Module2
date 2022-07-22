package exercise;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return Math.PI * Math.pow(Circle.radius, 2);
    }
}
