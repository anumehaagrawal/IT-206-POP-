class vehicle{
	final int speed=300;
	final void getSpeed(){
		System.out.println("speed is "+speed);

	}
	public void getLife(){
		System.out.println("Lifetime is 8 years");
	}
}
class bike extends vehicle{
	public void getLife(){
		System.out.println("Lifetime is 6 years");
	}

}
final class house{
	final int rate=1000;
	public void getHomeRate(){
		System.out.println("rates for ghouse are"+rate);
	}
}
public class prog5{
	public static void main(String args[]){
		vehicle v= new vehicle();
		v.getSpeed();
		v.getLife();
		bike b=new bike();
		b.getLife();
		house h=new house();
		h.getHomeRate();
	}
}