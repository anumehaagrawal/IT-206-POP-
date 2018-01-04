import java.util.Scanner;
public class prog2{
	public static void main(String args[]){
		float a,b,c,d,x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter coefficients of first equation then other");
		a=scan.nextFloat();
		b=scan.nextFloat();
		c=scan.nextFloat();
		d=scan.nextFloat();
		x=(d-b)/(a-c);
		y=((a*d)-(c*b))/(a-c);
		System.out.println("x is "+x);
		System.out.println("y is "+y);

	}
}