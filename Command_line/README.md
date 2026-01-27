# Command_Line
### Code
~~~
public class TriangleArea {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java TriangleArea <base> <height>");
            return;
        }

        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);
    }
}
~~~
### Output
<img width="702" height="352" alt="image" src="https://github.com/user-attachments/assets/a1ce7161-cd6f-478a-bf0c-0fb6899f8a47" />
