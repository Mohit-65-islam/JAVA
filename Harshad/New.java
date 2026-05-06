
class circle {

    public double rad;
    public double pi = 3.1416;

    public circle(double rad) {
        this.rad = rad;
    }

    public void cirarea() {
        System.out.println("Area of Circle = "+2 * pi * rad * rad);
    }
}

class rectangle {

    public double len, wid;

    public rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public void recarea() {
        System.out.println("Area of Rectangle= "+len * wid);
    }

    public void recparameter() {
        System.out.println("Parameter of Rectangle= "+2 * (len + wid));
    }
}

class triangle {

    public double base, height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void triarea() {
        System.out.println("Area of Triangle= "+0.5 * base * height);
    }
}

public class New {

    public static void main(String[] args) {
        double rad = Double.parseDouble(args[0]);
        double len = Double.parseDouble(args[1]);
        double wid = Double.parseDouble(args[2]);
        double base = Double.parseDouble(args[3]);
        double height = Double.parseDouble(args[4]);
        circle c = new circle(rad);
        c.cirarea();
        rectangle r = new rectangle(len, wid);
        r.recarea();
        r.recparameter();
        triangle t = new triangle(base, height);
        t.triarea();

    }
}
