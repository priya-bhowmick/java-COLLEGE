import java.util.*;
public class LinearSearch{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
    int n,i,flag=0,loc=0;
    System.out.println("enter size of array");
    n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the element to be searched");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int key;
    System.out.println("enter the element to be searched");
    key=sc.nextInt();
    for(i=0;i<a[i];i++){
        if(a[i]==key){
            flag=1;
            loc=i;
        }
    }
    if(flag==1){
        System.out.println(loc);
    }
}
}