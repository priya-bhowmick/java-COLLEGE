import java.util.*;
public class Area{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breadth");
		int l,b;
		l=sc.nextInt();
		b=sc.nextInt();
		int area,peri;
		area=l*b;
		peri=2*(l+b);
		System.out.println("area is:"+area);
		System.out.println("perimeter is:"+peri);
	}
}
		