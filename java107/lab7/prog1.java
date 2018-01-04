import java.util.Scanner;
abstract class Vehicle{
	abstract int run();
	Vehicle(){
		System.out.println("Vehicle stores");
	}
	void price(){
		System.out.println("Costs exceed 1lakh");
	}
	abstract void stores();
}
class car extends Vehicle{
	int run(){
		System.out.println(" Car Runs at a godspeeed");
		return 89;
	}
	void stores(){
		System.out.println("There are 8 stores");
	}

}
class bike extends Vehicle{
	int run(){
		System.out.println(" Bike Runs at a godspeeed");
		return 65;
	}
	void stores(){
		System.out.println("There are 18 bike stores");
	}

}
public class prog1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for car and 2 for bike");
		int a,c;
		a=scan.nextInt();
		if (a==1){
		Vehicle obj=new car();
		c=obj.run();
		System.out.println(c);
		obj.price();
		obj.stores();

		}
		else{
		Vehicle obj=new bike();
		c=obj.run();
		System.out.println(c);
		obj.price();
		obj.stores();


		}
		
	}
}