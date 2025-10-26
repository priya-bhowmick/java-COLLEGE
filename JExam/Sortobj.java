import java.util.*;
public class Sortobj{
	public void bubble(int n, int a[]){
		int i,j,temp=0;
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public void insertion(int n,int b[]){
		int j,i,k;
		for(i=1;i<n;i++){
			j=i-1;
			k=b[i];
			while(j>=0 && b[j]>k){
				b[j+1]=b[j];
				j=j-1;
			}
			b[j+1]=k;
		}
	}
	public void display(int n,int c[]){
		int i;
		for(i=0;i<n;i++){
			System.out.println(c[i]);
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int m=sc.nextInt();
		int arr[]=new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++){
			arr[i]=sc.nextInt();
		}
		Sortobj obj=new Sortobj();
		obj.bubble(m,arr);
		System.out.println("after bubble sort");
		obj.display(m,arr);
		Sortobj obj1=new Sortobj();
		obj1.insertion(m,arr);
		System.out.println("after insertion sort");
		obj.display(m,arr);
	}
}
			
					