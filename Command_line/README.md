# Command_Line
### Code
~~~
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);

        sc.close();
    }
}
~~~
### Output
<img width="702" height="352" alt="image" src="https://github.com/user-attachments/assets/a1ce7161-cd6f-478a-bf0c-0fb6899f8a47" />
