import java.util.Scanner;
public class prog2{
	public static void main(String args[]){
		double p,t,r,amount;
		Scanner scan = new Scanner(System.in);
		p=scan.nextDouble();
		r=scan.nextDouble();
		t=scan.nextDouble();
		System.out.println("Year  Amount");
		for(int i=1;i<=t;i++){
			amount=p*(Math.pow((1+(r/100)),i));
			System.out.println(amount);
				


		}

	}
		
}