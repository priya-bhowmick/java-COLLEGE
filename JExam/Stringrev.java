import java.util.*;
class Stringrev{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String str,rev="";
		System.out.println("enter a string");
		str=sc.next();
		int len=str.length();
		int i,j;
		System.out.println("reverse String is");
		for(i=len-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}
		