package conditions;
import java.util.Scanner;
//java.lang.*;
public class IfElseExample {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);//Scanner is used for accepting Input		
		System.out.println("Enter A");		
		int a=scn.nextInt();
		System.out.println("Enter Name");	
		String name=scn.next();	 		
		System.out.println("Enter B");		
		int b=scn.nextInt();
		System.out.println("Hello "+name+" here is your result");
		if(a>b)
			System.out.println("a is bigger");			
		else if(b>a)
			System.out.println("b is bigger");
		else
			System.out.println("they are equal");
	}
}
// if(a>b ||  &&)