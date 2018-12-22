package Handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		System.out.println(div(a,b));
	}
	static int div (int a,int b) {
		
		int c=0;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e1)
		{
			System.out.println(" Donot divide a number by zero");
		}
				return c;
				
	}
}
