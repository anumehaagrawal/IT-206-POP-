import java.util.Scanner;
public class prog3{
 
  public void convertBinary(int num){
     int binary[] = new int[40];
     int index = 0;
     while(num > 0){
       binary[index++] = num%2;
       num = num/2;
     }
     for(int i = index-1;i >= 0;i--){
       System.out.print(binary[i]);
     }
  }
 
  public static void main(String a[]){
    int b;
    Scanner scan =new Scanner(System.in);
     prog3 obj = new prog3();
     b=scan.nextInt();
     obj.convertBinary(b);
     }
}