import java.util.*;
public class Factorial{
	int Fact(int num){
		if(num>=1)
			return num*Fact(num-1);
		else
			return 0;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a positive integer");
		n=sc.nextInt();
		int c=Fact(n);
		System.out.println(c);
	}
}