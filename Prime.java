import java.util.*;
public class Prime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("enter the value of n to set the range");
		n=sc.nextInt();
		for(i=2;i<n/2;i++){
			if(n%i!=0){
				System.out.println(i);
			}
			else{
				continue;
			}
		}
	}
}
		