import java.util.Scanner;
public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        Circle circle = new Circle(radius);
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle circumference: " + circle.circumference());
        System.out.println("Cylinder surface area: " + cylinder.surfaceArea());
        System.out.println("Cylinder volume: " + cylinder.volume());
    }
}

