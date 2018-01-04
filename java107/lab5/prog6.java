import java.util.Scanner;
public class prog6{
	public double area,a,b;
	public double const1 = 6;
	public double const2=3.14;
	prog6(){
		a=0;
		b=0;
	}
	prog6(double n,double m){
		this.a=m;
		this.b=n;
	}
	prog6(double a){
		this.a=a;
	}
	public double getSquare(){
		return a*a;
	}
	public double getCube(){
		return const1*a*a;
	}
	public double getRect(){
		return a*b;
	}
	public double getCylin(){
		return const2*a*a*b;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b;
		System.out.println("Side of Square");
		a = scan.nextDouble();
		prog6 obj = new prog6(a);
		System.out.println("Square"+" "+ obj.getSquare());
		System.out.println("Sides of Rect");
		a = scan.nextDouble();
		b=scan.nextDouble();
		prog6 obj1 = new prog6(a,b);
		System.out.println("Rect"+" "+ obj1.getRect());
		System.out.println("Side of Cube");
		a = scan.nextDouble();
		prog6 obj2 = new prog6(a);
		System.out.println("Square"+" "+ obj2.getCube());
		System.out.println("Side of Cylinder");
		a = scan.nextDouble();
		b=scan.nextDouble();
		prog6 obj3 = new prog6(a,b);
		System.out.println("Cylinder"+" "+ obj3.getCylin());
		
		
	}
}