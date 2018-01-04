import java.util.Scanner;
class numb{
	int x;
	int y;
	numb(int i,int j){
		x=i;
		y=j;
	}
}
public class prog3{
	public void callbyref(numb a){
		int temp;
		temp=a.x;
		a.x=a.y;
		a.y=temp;
	}
	public void callbyval(int m,int n){
		int t;
		t=m;
		m=n;
		n=t;
		System.out.println("Swapped inside val function is "+m+n);
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter numbers");
		n1=scan.nextInt();
		n2=scan.nextInt();
		numb o=new numb(n1,n2);
		prog3 obj=new prog3();
		obj.callbyval(n1,n2);
		obj.callbyref(o);
		System.out.println("Cll by value swaps"+n1+n2);
		System.out.println("Call by ref swaps"+o.x+o.y);
	}
}