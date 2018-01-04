import java.util.Scanner;
public class prog5{
	final double con = 3.14;
	double vol;

	public double volume(double s){
		
		this.vol=2 *s*s*con;
		return vol;

	}
	public double volume(double  a,double b, double c){
		this.vol=2 *a*b*c;
		return vol;
	}
	public double volume(double a, double b){
		vol=2*con*a*b;
		return vol;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("To calculate area of hemisphere 1, prism 2, cylinder 3");
		double v,s,t,u;
		char a;
		prog5 obj =new prog5();
		a=scan.next().charAt(0);
		
		switch(a){
			case '1':
				s=scan.nextDouble();
				v=obj.volume(s);
				System.out.println(v);
				break;
			case '2':
				s=scan.nextDouble();
				t=scan.nextDouble();
				u=scan.nextDouble();

				v=obj.volume(s,t,u);
				System.out.println(v);
				break;
			case '3':
				s=scan.nextDouble();
				t=scan.nextDouble();
				v=obj.volume(s,t);
				System.out.println(v);
				break;
		


		}
	}
}