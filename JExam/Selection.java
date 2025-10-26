import java.util.*;
public class Selection{
	public void sort(int n, int arr[]){
		int i,j,temp=0;
		for(i=0;i<n-1;i++){
			int min=i;
			for(j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	void display(int n,int b[]){
		int i;
		for(i=0;i<n;i++){
			System.out.println(b[i]);
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int m=sc.nextInt();
		int a[]=new int[m];
		System.out.println("enter the array element");
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
		}
		Selection obj=new Selection();
		obj.sort(m,a);
		obj.display(m,a);
	}
}
		