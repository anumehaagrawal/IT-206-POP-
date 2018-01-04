import java.util.Scanner;
class director{
	double salary;
	String name;
	String appraisal;
	director(String name,String app,double sal){
		this.salary=sal;
		this.name=name;
		this.appraisal=app;
	}
	public double getSal(){
		return salary;
	}
	public void getDets(){
		System.out.println("Name is"+name);

	}
	public void getAppr(){
		System.out.println("Your position is"+appraisal);
	}
}
class employee extends director{
	double taxes;
	
	employee(String name,String app,double sal,double taxes){
		super(name,app,sal);
		this.taxes=taxes;
	}
	public double getTax(){
		return taxes;
	}
	public double getSal(){
		return salary-taxes;
	}
	public void getAppr(){
		System.out.println("You arent the director so no appraisal!"+appraisal);
	}


}
public class prog1{
	public static void main(String args[]){
		String a,b,d,e;
		double c,f,g,sal,sal1;
		System.out.println("Enter name appraisal and salary");
		Scanner scan=new Scanner(System.in);
		a=scan.next();
		b=scan.next();
		c=scan.nextDouble();
		System.out.println("Enter name appraisal and salary and taxes ");

		director dir = new director(a,b,c);
		d=scan.next();
		e=scan.next();
		f=scan.nextDouble();
		g=scan.nextDouble();
		
		employee emp=new employee(d,e,f,g);
		sal=dir.getSal();
		System.out.println("Directors salary without taxes is "+sal);
		sal1=emp.getSal();
		System.out.println("Employees overall is "+sal1);
		dir.getAppr();
		emp.getAppr();

	}
}