package nov21;
import java.util.Scanner;

public class PolyLoad {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=s.nextInt();
		System.out.println("Enter b:");
		int b=s.nextInt();
		System.out.println("enter c:");
		int c=s.nextInt();
		Ply p=new Ply();
		p.Mul(a,b,c);
		
	}

}
class Ply{
	void Mul(int a,int b){
		System.out.println("the answer is");
		System.out.println(a*b);
	}
	
		void Mul(int a,double b){
		System.out.println("the answer is");
			System.out.println(a*b);
		}
			
			void Mul(int a,int b,int c){
				System.out.println("The answer is:");
				System.out.println(a*b*c);
    
			}
}








