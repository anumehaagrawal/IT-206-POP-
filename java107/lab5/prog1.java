import java.util.Scanner;
import java.util.*; 
public class prog1{
	public static int sum=0;
	public static void price(String num,int quant){
		switch (num){
			case "Upma" :
				sum=sum+(4*quant);
				break;
			case "Tomato":
				sum=sum+(8*quant);
				break;
			case "vada":
				sum=sum+(9*quant);
				break;
			case "Biscuits":
				sum=sum+(6*quant);
				break;
			case "Bean":
				sum=sum+(2*quant);
				break;

		

	}
	}
	public static int cost(){
		return sum;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		int code =0;
		int b,c;
		String a;
		System.out.println("choose the product and quantity : 1) Upma 2) Tomato 3) vada 4) Biscuits 5)Bean");
		while(code ==0){
			a=scan.next();

			b=scan.nextInt();
			hm.put(b,a);
			prog1.price(a,b);
			System.out.println("If you want more products press 0 or press -1");

			c=scan.nextInt();
			code=c;

		}
		System.out.println("Total cost"+prog1.cost());
		  for(Map.Entry m:hm.entrySet()){  
   			    System.out.println(m.getKey()+" "+m.getValue()); 


	}
}
}