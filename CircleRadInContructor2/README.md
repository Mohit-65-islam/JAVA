# Area of Circle
### Circle Code
~~~
public class Circle {

    private double radius; 

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }
    public double getRadius() {
        return this.radius;
    }
    public double computeArea() {
        return radius * radius * Math.PI;
    }
}
~~~
### Main Class Code
~~~
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println("Area = " + c.computeArea());
    }
}
~~~
### Output
<img width="885" height="180" alt="image" src="https://github.com/user-attachments/assets/42678048-5742-49a1-b880-d3e3e3afa920" />

