package nov21;
import java.util.Scanner;
public class TryCatch {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=s.nextInt();
		System.out.println("Enter b:");
		int b=s.nextInt();

 try{
	int mul=(a/b);
	System.out.println(mul);
}
 catch(ArithmeticException e){
	 System.out.println("exceptional error"+e);
		int a1=s.nextInt();
		int b1=s.nextInt();
		int mul1=(a1/b1);
		System.out.println(mul1);
	 
	 
}
 finally{
	 System.out.println("thank you!");
 }
}
}