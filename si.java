import java.util.*;
public class si{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int p,r,t;
		System.out.println("enter the principle amounut");
		p=sc.nextInt();
		System.out.println("enter the rate in percent");
		r=sc.nextInt();
		System.out.println("enter the time in sec");
		t=sc.nextInt();
		double si;
		si=(p*r*t)/100;
		System.out.println("Simple interest: "+si);
	}
}
		