import java.util.*;
class Stringpal{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter a string");
		str=sc.next();
		String rev="";
		String temp=str;
		int len=str.length();
		int i,j;
		for(i=len-1;i>=0;i--){
				rev=rev+str.charAt(i);
			}
		
			if(rev.equals(temp)){
				System.out.println("string palinddrome");
		}
		else{
			System.out.println("not string palinddrome");
		}
		}
}
	

		