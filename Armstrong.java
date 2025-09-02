import java.util.*;
public class Armstrong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n,num,rem,res=0;
		System.out.println("enter the number");
		n=sc.nextInt();
		num=n;
		while(n!=0){
			rem=n%10;
			res+=Math.pow(rem,3);
			n=n/10;
		}
		if(res==num){
			System.out.println("armstrong no.");
		}
		else{
			System.out.println("not armstrong no.");
		}
	}
}