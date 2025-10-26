import java.util.*;
class RemArr{
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
		System.out.println("enter the element to be removed");
		int x=sc.nextInt();
		int p=0;
		for(i=0;i<n;i++){
			if(arr[i]==x){
				p=i;
				break;
			}
		}
		System.out.println("After removal");
		if(p==0){
			System.out.println("element not found");
		}
		for(i=0;i<n;i++){
			if(i!=p){
				System.out.println(arr[i]);
			}
		}
	}
}