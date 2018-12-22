package OverLoading;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(Sub(20,7));
    System.out.println(Sub(60.3,43.56));
    System.out.println(Sub("Divya" ,"Ponmozhi"));
	}
     public static int Sub (int a,int b){
     return (a-b);
}
 public static double Sub (double a ,double b) {
  return (a-b);
 }
  public static String Sub (String a, String b){
	  return (a+b);
  }
}
