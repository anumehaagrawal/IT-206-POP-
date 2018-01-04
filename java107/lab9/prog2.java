public class prog2 implements Runnable{
	public int i=0;
	public void run(){
		System.out.println(i++);
	}
	public static void main(String args[]){
		prog2 inter=new prog2();
		Thread t1=new Thread(inter);
		t1.start();
		Thread t2=new Thread(inter);
		t2.start();
		System.out.println("Sleeping...");
		
	}
}