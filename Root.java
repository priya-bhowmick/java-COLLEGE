import java.util.*;
public class Root{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the variables a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		double d=Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
		System.out.println(d);
	}
}