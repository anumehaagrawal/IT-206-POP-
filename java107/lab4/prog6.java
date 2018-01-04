import java.util.Scanner;
public class prog6{
	public static void main(String args[]){
		int a[]= new int[100];
		int n,temp,count,max;
		max=-11;
		count=1;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();

		}
		for(int j=0;j<n-1;j++){
			for(int k=0;k<n-j-1;k++){
				if(a[k]>a[k+1]){
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		for(int m=0;m<n-1;m++){
			if(a[m+1]-a[m]==1){
				count=count+1;
				max=Math.max(max,count);
			}
			else
			{
				count=1;
				max=Math.max(max,count);

			}
		}
		System.out.println(max);
	}
}