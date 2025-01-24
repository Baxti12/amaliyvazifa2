public class Main {
    public static void main(String[] args) {

        Car car = new Car("Qizil", "Toyota", 25000.0, "Avtomat");
        car.displayCarInfo();


        RightAngledTriangle triangle = new RightAngledTriangle(3.0, 4.0);
        System.out.println("Yuz: " + triangle.calculateArea());
        System.out.println("Perimetr: " + triangle.calculatePerimeter());


        Point point = new Point(1.0, 2.0, 3.0);
        point.displayPointInfo();
        
    }
}
