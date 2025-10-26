import java.util.*;
public class LSearch{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("ENTER THE RANGE OF ARRAY");
		n=sc.nextInt();
		int f=0;
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k;
		System.out.println("enter the elements to be searched");
		k=sc.nextInt();
		for(i=0;i<n;i++){
			if(arr[i]==k){
				System.out.println("element found at position"+i);
				f=1;
			}
		}
		if(f==0){
			System.out.println("element not found");
		}
	}
}
		
				