import java.util.*;
import java.lang.*;
public class Excep{
	public static void main(String[]args){
		try{
			int i=args.length;
			String str[]=new String[i];
			str[0]=args[0];
			if(str[0].equals("java")){
				System.out.println("first word is java");
			}
			System.out.println("no. of argument is:"+i);
			int x=56/i;
			int y[]={333,888};
			y[i]=x;
		}
		catch(ArithmeticException e){
			System.out.println("div by 0"+e);
		}
		catch(NullPointerException e){
			System.out.println("a null pointer excep:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array index exception"+e);
		}
	}
}
				
			