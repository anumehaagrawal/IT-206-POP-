import java.util.Scanner;
public class prog3{
	public static void main(String args[]){
		int a[]= new int[40];
		int p,count,max;
		max=-111;
		count=1;
		Scanner scan = new Scanner(System.in);
		p=scan.nextInt();
		for(int i=0;i<p;i++){
			a[i]=scan.nextInt();
		}
		for(int i=1;i<p;i++){
			if(a[i]>=a[i-1])
			{
				count++;
				max=Math.max(max,count);
			}
			else{
				max=Math.max(max,count);
				count=1;
			}
		}
		System.out.println("Longest path is"+max);

	}
}