package Inheritance;

class parent extends child
{
	public void display()
{
		System.out.print("\n Im Divya");
		
}
	}

class child 
{
	public void display1()
	{
		System.out.print("\n I Love Music");
	}
}
class main_fun
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent o=new parent();

o.display();
o.display1();

	}

}

