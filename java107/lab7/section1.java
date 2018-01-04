package attendance;
import java.util.Scanner;
public class section1{
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter details for section A");
		String a;;
		int ac;
		for(int i=0;i<9;i++){
			a=scan.next();
			ac=scan.nextInt();
			attend stud=new attend(a,ac);
			stud.getAttendance();

		}

	}
}