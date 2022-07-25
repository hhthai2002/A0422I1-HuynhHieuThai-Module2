package exercise;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(String color, double radius, double height){
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height * Math.pow(this.getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A cylinder with height: " + getHeight() + ", which is a subclass of " + super.toString();
    }
}
