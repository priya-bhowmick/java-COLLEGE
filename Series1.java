import java.util.*;
public class Series1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter n to print series upto n");
		n=sc.nextInt();
		double sum=0;
		for(i=1;i<=n;i++){
			sum+=1/i;
			System.out.println(sum);
		}
	}
}
		