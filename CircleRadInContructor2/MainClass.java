import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Create object using constructor
        Circle c = new Circle(r);

        // Print area
        System.out.println("Area = " + c.computeArea());
    }
}
