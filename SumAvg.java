import java.util.*;
public class SumAvg{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int i;
		double sum=0,avg=0,count=0;
		System.out.println("enter the range ");
		int n=sc.nextInt();
		for(i=0;i<=n;i++){
			sum+=i;
			count++;
			avg=sum/count;
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}
		
			