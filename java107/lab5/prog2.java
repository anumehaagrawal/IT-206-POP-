import java.util.Scanner;
public class prog2{
	static int sum=750;
	static{
		System.out.println("Welcome to library management system");
	}
	public void fiction(){
		System.out.println("Books in this genre are 350");
		System.out.println("Authors are Dan Brown , JK Row3ling");
	}
	public void biog(){
		System.out.println("Books in this genre are 250");
		System.out.println("Authors are MK Gandhi , Steve jobs");
	}
	public void scifi(){
		System.out.println("Books in this genre are 150");
		System.out.println("Authors are Noam Scotz, berlin marchverg");
	}

	public static int tot(){
		return sum;
	}
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		System.out.println("To enquire about a genre 1) Fiction 2)Biography 3)Scifi enter code");
		int a;
		a=scan.nextInt();
		prog2 obj= new prog2();

		switch(a){
			case 1:
				obj.fiction();
				break;
			case 2:
				obj.biog();
				break;
			case 13:
				obj.scifi();
				break;
			}
		System.out.println("total is"+prog2.tot());





		}

	
}