package Dimensional;
public class TwoDimensionalArray {
public static void main(String[] args) {
		int[][] TwoDim = new int[3][3];
		int temp = 4;
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				TwoDim[i][j] = temp;
				temp += 4;
			}
				}
		{
			for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
	System.out.print(TwoDim[i][j]+ " ");
			}
			System.out.println();
		}
		}
		
}
}	