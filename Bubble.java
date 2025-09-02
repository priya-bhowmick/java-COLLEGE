import java.util.*;
public class Bubble{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
    int n,i,j,temp,flag=0;
    System.out.println("enter size of array");
    n=sc.nextInt();;
	int a[]=new int[n];
    System.out.println("enter array elements");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            }
        }
    }
    if(flag==1){
    System.out.println("sorted array is : ");
    for(i=0;i<n;i++){
        System.out.println(a[i]);
    }
    }
}
}
