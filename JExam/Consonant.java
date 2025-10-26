import java.util.*;
public class Consonant{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the string");
		str=sc.next();
		int len=str.length();
		int i;
		for(i=0;i<len;i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
				System.out.println(str.charAt(i));
			}
		}
	}
}
		