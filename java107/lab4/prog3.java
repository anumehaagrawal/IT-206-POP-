import java.util.Scanner;
public class prog3{
	public static void main(String args[]){
		int a[]=new int[100];
		int m,n,c;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			m=scan.nextInt();
			a[i]=m;
		}
		System.out.println("Enter an array element");
		c=scan.nextInt();
		for(int j=0;j<n;j++){
			if(a[j]==c)
				System.out.println("index is"+j);
		}
	}}