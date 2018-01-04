import java.util.Scanner;
class Student{
	int roll;
	String name ;
	int sem;
	Student(int r , String n , int s){
		roll=r;
		name=n;
		sem=s;
	}

}
public class prog4{
	public static void main(String args[]){
		int b,c,e,f;
		String a,d;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter details of first sem");
		a=scan.nextLine();
		b=scan.nextInt();
		c=scan.nextInt();
		System.out.println("Enter details of 2nd sem");
		d=scan.next();
		e=scan.nextInt();
		f=scan.nextInt();
		Student s= new Student(b,a,c);
		Student s2 = new Student(e,d,f);
		System.out.println(s.name + " " + s.sem);
		System.out.println(s2.name + " " + s2.sem);
	}
}

