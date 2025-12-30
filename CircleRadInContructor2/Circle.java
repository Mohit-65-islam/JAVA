public class Circle {

    private double radius;   // private access modifier

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter
    public void setRadius(double rad) {
        this.radius = rad;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    // Compute area
    public double computeArea() {
        return radius * radius * Math.PI;
    }
}
