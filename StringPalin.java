import java.util.*;
public class StringPalin{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		String s;
		char c;
		int i;
		for (i=str.length();i>=0;i--){
			c=str.charAt(i);
		}
		if(str.isEquals(c)){
			System.out.println("its a String palindrome");
		}
		else{
			System.out.println("not a String palindrome");
		}
	}
}
		