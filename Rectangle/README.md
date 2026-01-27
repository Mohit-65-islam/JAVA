# Rectangle.java
### code:
~~~
import java.text.DecimalFormat;

class Rectangle {
    public static void main(String[] args) {

        double width = 4.5;
        double height = 8.5;
        double area = width * height;
        double perimeter = 2 * (width + height);

	DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Area: " + df.format(area));
        System.out.println("Perimeter: " + df.format(perimeter));

    }
}
~~~
