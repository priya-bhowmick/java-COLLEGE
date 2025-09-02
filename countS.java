import java.util.*;
public class countS{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String str;
		int count=0;
		System.out.println("enter a string to count its length");
		str=sc.next();
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println(count);
	}
}