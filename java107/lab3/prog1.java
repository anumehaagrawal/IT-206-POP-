import java.util.Scanner;
public class prog1{
	public static void main(String args[]){
		int a , b,c;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a>b && b>c)
			System.out.println("Decreasing");
		else if(a<b && b<c)
			System.out.println("Increasing");
		else
			System.out.println("Non increasing or decreasing");
	}
}

