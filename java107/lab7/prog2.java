import java.awt.*;
import java.awt.event.*;
interface Serializable{

}
interface Inf1{
   public void method1();
}
interface Inf2 extends Inf1 {
   public void method2();
}
class Demo implements Inf2{
  
    public void method1(){
	System.out.println("method1");
    }
    public void method2(){
	System.out.println("method2");
    }
    interface lite{
    	public void run();
    }
    
}
class mean implements Demo.lite{
	public void run(){
		System.out.println("rUNNNNN");
	}
}
abstract class meha implements Inf1{
	public void school(){
		System.out.println("dps south");
	}
}
class clew extends meha{
	 
		public void method1(){
			System.out.println("meha method1");
		}
	}

class MouseAdapterExample extends MouseAdapter{
	Frame f;
	MouseAdapterExample(){
		f=new Frame("designs");
		f.addMouseListener(this);
		f.setLayout(null);
		f.setSize(200,200);
		f.setVisible(true);

		
	}
	 public void mouseClicked(MouseEvent e) {  
        Graphics g=f.getGraphics();  
        g.setColor(Color.GREEN);  
        g.fillOval(e.getX(),e.getY(),20,30);  
    }  


}
public class prog2{
	public static void main(String args[]){
		new MouseAdapterExample();
		Inf2 obj = new Demo();
		obj.method2();
		obj.method1();
		Demo.lite o=new mean();
		o.run();
		Inf1 an=new clew();

		an.method1();





}

}
