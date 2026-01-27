# Command_Line
### Code
~~~
import java.text.DecimalFormat;

class CommandLine {
    public static void main(String[] args) {

            double width = Double.parseDouble(args[0]);
            double height = Double.parseDouble(args[1]);
            double area = width * height;
            
            DecimalFormat df = new DecimalFormat("0.000");
	
            System.out.println("Area: " + df.format(area));

    }
}
~~~
### Output
<img width="702" height="352" alt="image" src="https://github.com/user-attachments/assets/a1ce7161-cd6f-478a-bf0c-0fb6899f8a47" />
