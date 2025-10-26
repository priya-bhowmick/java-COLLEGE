import java.util.*;
class Myexception extends Exception{
	Myexception(String s){
		super(s);
	}
}
class Ownexcep{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		try{
		int n;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		if(n<0){
			throw new Myexception("negetive size error");
		}
		else{
			int arr[]=new int[n];
			System.out.println("enter array elements");
			int i;
			for(i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println("array is" );
			for(i=0;i<n;i++){
				System.out.println(arr[i]);
			}
		}
		}
		catch(Myexception ex){
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}
}
		