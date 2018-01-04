    class prog4 extends Thread{  
     public void run(){  
      for(int i=1;i<=5;i++){  
       try{  
        Thread.sleep(500);  
       }catch(Exception e){System.out.println(e);}  
      System.out.print(i);  
      }  
     }  
    public static void main(String args[]){  
     prog4 t1=new prog4();  
     prog4 t2=new prog4(); 
     prog4 t3=new prog4(); 
     t1.start();  
     try{  
      t1.join();  
     }catch(Exception e){System.out.println(e);}  
      
     t2.start();  
     t3.start();  
     }  
    }  