package Lab12;
import java.util.Scanner;
import java.io.IOException;
public class Lab12b {
	void myMethod(int num)throws IOException, ClassNotFoundException { 
		if(num==1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integers: ");
		int num = sc.nextInt();
		int b = sc.nextInt();
		try {
			Lab12b obj=new Lab12b(); 
			 int c = num/b;
			 System.out.println ("Result of division = " + c); 
		}
		catch(ArithmeticException e) {
			System.out.println ("You can not divide a number by 0");
		}
	}
}
