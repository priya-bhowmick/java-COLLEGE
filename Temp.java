import java.util.*;
public class Temp{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temparature in farenheit");
		int temp=sc.nextInt();
		double c=(temp-32)/1.8;
		System.out.println("In celcius"+c);
	}
}	
		