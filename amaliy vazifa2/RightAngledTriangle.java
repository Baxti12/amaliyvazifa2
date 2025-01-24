public class RightAngledTriangle {

    private double a;
    private double b;

    public RightAngledTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public double calculateArea() {
        return 0.5 * a * b;
    }


    public double calculatePerimeter() {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }
}
