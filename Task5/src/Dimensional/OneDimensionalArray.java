package Dimensional;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 int[] a= {2,4,6,8,10,12};
		 System.out.println(a[1]+" "+a[4]);
		 
		 // enhanced for
		 for(int temp : a) {
			 System.out.println(temp);
		 }
	}
	{
	int[] x = new int[5];
	x[0]= 15;
	x[3]= 22;
	for(int temp2 : x) {
		System.out.println(temp2);
	}

}

}
