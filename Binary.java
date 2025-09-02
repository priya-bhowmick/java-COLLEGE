import java.util.*;
public class Binary{
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
     System.out.println("enter the element to be searched\n");
    int key=sc.nextInt();
    int beg=0;
    int end=n;
    int mid=(beg+end)/2;
    while(beg<=end && a[mid]!=key){
        if(a[mid]<key){
            beg=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=(beg+end)/2;
    }
    if(a[mid]==key){
        System.out.println("element found at "+mid);
    }
    else{
        System.out.println("element not found");
    }
}
}
