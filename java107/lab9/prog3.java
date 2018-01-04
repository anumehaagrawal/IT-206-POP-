
  class prog3 extends Thread{  
     public void run(){  
      for(int i=1;i<5;i++){  
          try{
            Thread.sleep(500);
            System.out. println("hello");
          }
          catch(InterruptedException e)
          {
            System.out.println(e);
          } 
        System.out.println(i);  
      }  
     }  
     public static void main(String args[]){  
      prog3 t1=new prog3();  
      prog3 t2=new prog3();  
       
      t1.start();  
      t2.start();  
     }  
    }  