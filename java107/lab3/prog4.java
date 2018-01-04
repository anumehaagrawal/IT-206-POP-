import java.util.Scanner;
public class prog4{
	
	public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
               return x;
 
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            return binarySearch(arr, mid+1, r, x);
        }

        return -1;
    }
	public static void main(String args[]){
		int a[]= new int[40];
		int b[]=new int[40];
		int p,c;
		Scanner scan = new Scanner(System.in);
		p=scan.nextInt();
		
		for(int i=0;i<p;i++){
			System.out.println("enter element of first array then second");
			a[i]=scan.nextInt();
			b[i]=scan.nextInt();
		}
		prog4 m=new prog4();
		System.out.println("Common element");
		for(int i=0;i<p;i++){
			c=m.binarySearch(b,0,p-1,a[i]);
			if(c!=-1)
				System.out.println(c);
		}
	}
}