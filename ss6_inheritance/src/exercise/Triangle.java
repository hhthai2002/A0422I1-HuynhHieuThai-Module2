package exercise;

public class Triangle extends Shape{
    public Triangle(){
    }
    public Triangle(double side1, double side2, double side3, String color){
        super(side1, side2, side3, color);
    }
    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }
    public double getArea(){
        double hp = getPerimeter() / 2;
        return Math.sqrt(hp * (hp - getSide1()) * (hp - getSide2()) * (hp - getSide3()));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
