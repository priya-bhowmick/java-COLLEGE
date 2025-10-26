import java.util.*;
public class Overload1{
	public void area(int l,int b){
		int a=(l*b);
		System.out.println("Area of rectangle is :"+a);
	}
	public void area(int s){
		int b=(s*s);
		System.out.println("area of Square is:"+b);
	}
	public void area(double r){
		double c=3.14*r*r;
		System.out.println("Area of circle is:"+c);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breadth");
		int len,brd,side;
		double rad;
		len=sc.nextInt();
		brd=sc.nextInt();
		System.out.println("enter the side of the square");
		side=sc.nextInt();
		System.out.println("enter the radius");
		rad=sc.nextDouble();
		Overload1 obj=new Overload1();
		obj.area(len,brd);
		obj.area(side);
		obj.area(rad);
	}
}
		