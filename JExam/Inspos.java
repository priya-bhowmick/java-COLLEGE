import java.util.*;
class Inspos{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter array size");
		n=sc.nextInt();
		int arr[]=new int[n+1];
		System.out.println("enter array elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to be inserted");
		int x=sc.nextInt();
		System.out.println("enter the position to insert");
		int p=sc.nextInt();
		for(i=n;i>p;i--){
			arr[i]=arr[i-1];
		}
		arr[p]=x;
		System.out.println("array is:");
		for(i=0;i<=n;i++){
			System.out.println(arr[i]);
		}
	}
}