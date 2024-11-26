import java.util.Scanner;
public class Hexagon_area 
{
 public static void main(String... args)
 {
    System.out.print("Enter the length of the side of the hexagon: ");
    Scanner in=new Scanner(System.in);
    int s=in.nextInt();
   //Area of a hexagon = (6 * s^2)/(4*tan(π/6))
    double area=((6*(s*s))/(4*Math.tan(Math.PI/6)));
    System.out.print("The area of "+s+" side length hexagon is: "+area);
    in.close();
 }   
}
