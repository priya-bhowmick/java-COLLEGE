import java.util.*;
class Cube{
	double side;
	Cube(){
		side=0.0;
	}
	Cube(double s){
		side=s;
	}
	void getVolume(){
		System.out.println("volume of cube is:"+side*side*side);
	}
}
class Cylinder extends Cube{
	double height;
	Cylinder(double s, double h){
		super(s);
		height=h;
	}
	void getVolume(){
		System.out.println("volume of Cylinder is:"+3.14*side*side*height);
	}
}
class Override1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double si,hi;
		System.out.println("enter the side of cube");
		si=sc.nextDouble();
		hi=sc.nextDouble();
		Cube obj=new Cube();
		Cube obj1=new Cube(si);
		Cylinder obj2=new Cylinder(si,hi);
		obj1.getVolume();
		obj2.getVolume();
	}
}
		
		
	