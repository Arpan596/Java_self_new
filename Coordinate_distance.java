import java.util.Scanner;
public class Coordinate_distance 
{
 public static void main(String... args)
 {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter the coordinates of the first point:");
  float x1=in.nextFloat();
  float y1=in.nextFloat();
  System.out.print("Enter the coordinates of the second point:");
  float x2=in.nextFloat();
  float y2=in.nextFloat();
  double radius=6371.01;
//   Distance between the two points [ (x1,y1) & (x2,y2)]
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Radius of the earth r = 6371.01 Kilometers
  double Distance=radius*Math.cos((Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
  System.out.println("The distance between two points of earth is:"+Distance);
  in.close();
 }   
}
