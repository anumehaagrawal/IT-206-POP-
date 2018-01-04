package attendance;
public class attend{
	String name;
	double cal;
	int classv;
	attend(String name,int classv){
		this.name=name;
		this.classv=classv;

	}
	public void calculate(int classv){
		double perc;
		perc=(classv/25)*100;
		this.cal=perc;

	}
	public void getAttendance(){
		System.out.println(this.cal);
	}
}
