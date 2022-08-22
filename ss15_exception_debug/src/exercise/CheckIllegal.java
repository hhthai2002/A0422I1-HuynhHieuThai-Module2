package exercise;

public class CheckIllegal {
    public boolean checkSides(double x, double y, double z) throws IllegalTriangleException {
        if (x <= 0) {
            throw new IllegalTriangleException("Triangle side can not be smaller than 0");
        }
        if (y <= 0) {
            throw new IllegalTriangleException("Triangle side can not be smaller than 0");
        }
        if (z <= 0) {
            throw new IllegalTriangleException("Triangle side can not be smaller than 0");
        }
        if(x + y < z){
            throw new IllegalTriangleException("These sides can not create a triangle!");
        }
        if(x + z < y){
            throw new IllegalTriangleException("These sides can not create a triangle!");
        }
        if(y + z < x){
            throw new IllegalTriangleException("These sides can not create a triangle!");
        }
        else {
            System.out.println("This is a triangle!");
        }
        return true;
    }
}
