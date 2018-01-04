import java.util.Scanner;
public class prog2{
	public static void main(String args[]){
		int a[]=new int[100];
		int n,m,sum;
		sum=0;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			m=scan.nextInt();
			a[i]=m;
			if(a[i]==10){
				sum=sum+a[i];
			}
		}
		if(sum==30)
			System.out.println("True");
		else
			System.out.println("False");
		}
	}
