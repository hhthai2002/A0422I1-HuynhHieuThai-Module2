package exercise;

public class Shape {
    private double side1 = 1.0f;
    private double side2 = 1.0f;
    private double side3 = 1.0f;
    private String color = "";

    public Shape(){
    }
    public Shape(double side1, double side2, double side3, String color){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape: " +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 + " and color is: " + color;
    }
}
