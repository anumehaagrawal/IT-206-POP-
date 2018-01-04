    class prog1 extends Thread{  
     public void run(){  
      for(int i=1;i<5;i++){  
         
        System.out.println(i);  
      }  
     }  
     public static void main(String args[]){  
      prog1 t1=new prog1();  
      prog1 t2=new prog1();  
       
      t1.start();  
      t2.start();  
     }  
    }  