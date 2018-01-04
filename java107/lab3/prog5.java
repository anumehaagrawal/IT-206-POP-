import java.util.Scanner;
class finance{
	int sal;
	int id;
	public int getSalaryf(int s){
		this.sal=s;
		return sal;
	}
	finance(int i){
		this.id=i;
	}
}
class tech{
	int sal;
	int id;
	public int getSalaryt(int s){
		this.sal=s;
		return sal;
	}
	tech(int i){
		this.id=i;
	}
}
public class prog5{
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter id");
		int i,sal,c;
		i=scan.nextInt();
		sal=scan.nextInt();
		if(i==1)
		{
			finance fin = new finance(i);
			c=fin.getSalaryf(sal);
		}
		else
		{
			tech te = new tech(i);
			c=te.getSalaryt(sal);
		}
		System.out.println("salary"+c);
	}
}
