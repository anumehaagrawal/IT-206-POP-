import java.util.*;
public class prog4{
	 public  String name;
	public  int a,b,c,d,e;
	public static HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
	prog4(String name, int a, int b,int c,int d , int e){
		this.name=name;
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;

	}
	public static void cost(prog4 obj){
		int sum;
		sum=obj.a+obj.b+obj.c+obj.d+obj.e;
		hm.put(sum,obj.name);
	}
	public static void total(){
		for(Map.Entry m:hm.entrySet()){  
   			    System.out.println(m.getKey()+" "+m.getValue());
		 
	}

	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String names;
		int m1,m2,m3,m4,m5;
	System.out.println("enter student name and then marks in 5 subjects for 6 students");
	for(int i=0;i<6;i++){
		System.out.println("Next");
		names=scan.next();
		m1=scan.nextInt();
		m2=scan.nextInt();
		m3=scan.nextInt();
		m4=scan.nextInt();
		m5=scan.nextInt();
		prog4 o = new prog4(names,m1,m2,m3,m4,m5);
		o.cost(o);
		}
		System.out.println("Details are");
		prog4.total();
	}
	
}