import java.util.Scanner;
public class prog4{
	public static void main(String args[]){
		int a,c;

		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
      c = a << 2;  
      System.out.println("a << 2 = " + c );

      c = a >> 2;     
      System.out.println("a >> 2  = " + c );

      c = a >>> 2;      
      System.out.println("a >>> 2 = " + c );
  }}