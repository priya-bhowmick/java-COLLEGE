import java.util.*;
class Myexception extends Exception{
	Myexception(String s){
		super(s);
	}
}
class Ownex{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n,i;
		int count=0;
		System.out.println("enter array size");
		n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		try{
		System.out.println("enter array elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
				if(arr[i]<0){
					throw new Myexception("negetive element input");
				}
				else{
						arr1[i]=arr[i];
					count++;
				}
				}
				System.out.println("array is:");
				for(i=0;i<count;i++){
					System.out.println(arr[i]);
				}
			}
		
		catch(Myexception ex){
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}
		
		}
		