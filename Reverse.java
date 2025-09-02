import java.util.*;
public class Reverse{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		int rev=0,sum=0,rem,a;
		a=n;
		while(n!=0){
			rem=n%10;
			sum+=rem;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse of digit:"+rev);
		System.out.println("sum of digit:"+sum);
	}
}
		