import java.util.Scanner;

public class CylinderSurface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hight of the cylinder:");
        double hight = sc.nextDouble();
        System.out.println("Enter cylinder redious:");
        int radious = sc.nextInt();
        System.out.println("Area of curved surface of a cylinder is "+2*Math.PI*hight);
    }
}
