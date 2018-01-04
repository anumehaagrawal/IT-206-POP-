import java.util.Scanner;
abstract class banking{
	
	public abstract void getHomeRate();
	public abstract void getCarRates();

}
class sbi extends banking{
	public void getHomeRate(){
		System.out.println("Sbi home rates are 4%");
	}
	public void getCarRates(){
		System.out.println(" sbi Car rates are 8%");
	}
}
class mysore extends banking{
	public void getHomeRate(){
		System.out.println("mysore home rates are 9%");
	}
	public void getCarRates(){
		System.out.println(" mysore Car rates are 8.4%");
	}
}
class canara extends banking{
	public void getHomeRate(){
		System.out.println("canara home rates are 6%");
	}
	public void getCarRates(){
		System.out.println(" canara Car rates are 7%");
	}
}
public class prog2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("Enter type of loans 1) car 2)home");
		a=scan.nextInt();
		banking b;
		if( a==1){
			b=new mysore();
			b.getCarRates();
			b=new canara();
			b.getCarRates();
			b=new sbi();
			b.getCarRates();
			

		}
		else{
			b=new mysore();
			b.getHomeRate();
			b=new canara();
			b.getHomeRate();
			b=new sbi();
			b.getHomeRate();
			
		}
	}
}