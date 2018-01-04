public class prog5{
	public static int n=9;
	public int m=98;
	public static class anu{
		
		public void anum(){
		 int c=9;
		 int sum=0;
		 sum =c+ n;
		System.out.println("my fav numbver is "+sum);
	}
}
	public class stu{
		
		public void stum(){
		int a=99;
		int summ=0;
		summ=a+m;
		System.out.println("stuts fav num is "+summ);
	}}
	public static void main(String[] args) {
		prog5 obj =new prog5();
		prog5.stu s= obj.new stu();
		prog5.anu a=new anu();
		s.stum();
		a.anum();

	}

}