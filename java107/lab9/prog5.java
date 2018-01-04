

public class prog5 implements Runnable {
   public void run() {

      for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "yielding control...");
            Thread.yield();
      }

      System.out.println(Thread.currentThread().getName() + " has finished executing.");
   }

   public static void main(String[] args) {
      prog5 inter=new prog5();
      Thread t1=new Thread(inter);
      Thread t2=new Thread(inter);
      Thread t3=new Thread(inter);
      t1.start();
      t2.start();
      t3.start();
   }
}