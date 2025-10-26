import java.util.*;
public class Halfsort{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n,i,j,temp=0;;
		System.out.println("enter array size");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int mid=n/2;
		for(i=0;i<mid;i++){
			for(j=i+1;j<mid;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=mid;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("after hafsort");
		for(i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
		
		
		