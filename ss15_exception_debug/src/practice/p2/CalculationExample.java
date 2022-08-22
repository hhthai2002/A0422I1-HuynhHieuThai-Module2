package practice.p2;

public class CalculationExample {
    public void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x / y;
            int d = x * y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x / y = " + c);
            System.out.println("x * y = " + d);
        }
        catch (Exception e){
            System.err.println("Exception was found: " + e.getMessage());
        }
    }
}
