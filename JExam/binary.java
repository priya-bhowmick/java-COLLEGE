import java.util.*;
public class binary{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter array size");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int j,temp=0;
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int k;
		System.out.println("enter elements to be searched");
		k=sc.nextInt();
		int l=0,u=n-1;
		while(l<=u){
			int mid=l+u/2;
			if(arr[mid]==k){
				System.out.println("elements found at"+mid);
			}
			else if(arr[mid]<k){
				l=mid+1;
			}
			else{
				u=mid-1;
			}
			if(l==u){
				System.out.println("elements not found");
			}
		}
		
	}
}
		
		