import java.util.Scanner;
public class prog6{
	
	float vol;

	public float volume(float s){
		
		this.vol=s*s*s;
		return vol;

	}
	public float volume(float a,float b, float c){
		this.vol=a*b*c;
		return vol;
	}
	public float volume(float a, float b){
		vol=3*a*a*b;
		return vol;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("To calculate vol of cube1, cuboid 2 , cylinder 3");
		float v,s,t,u;
		char a;
		prog6 obj =new prog6();
		a=scan.next().charAt(0);
		
		switch(a){
			case '1':
				s=scan.nextFloat();
				v=obj.volume(s);
				System.out.println(v);
				break;
			case '2':
				s=scan.nextFloat();
				t=scan.nextFloat();
				u=scan.nextFloat();

				v=obj.volume(s,t,u);
				System.out.println(v);
				break;
			case '3':
				s=scan.nextFloat();
				t=scan.nextFloat();
				v=obj.volume(s,t);
				System.out.println(v);
				break;
		


		}
	}
}