package Handling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[2];
			System.out.println("Access Element Three : "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("Exception Thrown :" +e);
		}
		System.out.println(" Out of the block");
				
		}

	}


