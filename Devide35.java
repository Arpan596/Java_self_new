public class Devide35 {
  public static void main(String[] args) {
    devidedBy(3);
    System.out.println("\n");
    devidedBy(5);
    
  }
    
    static void devidedBy(int i){
     System.out.println("Numbers devided by "+i+" = ");
     for(int a=1;a<100;a++)
     {
      if(a%i==0){
          System.out.print(a+",");
      }
     }
  }
}