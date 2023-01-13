package Lab12;
import java.util.Scanner;
import java.util.Random;
public class Lab12 {
	public static void main(String[] args) {
		int tenRandomIntegers[] = new int[10];
		Random random = new Random();
		Scanner sc = new Scanner(System.in);	
		for (int i=0; i<10; i++) {
			tenRandomIntegers[i] = random.nextInt(1000);
		}	
		System.out.println("Please enter an index number to display the corresponding element value: ");
		int indexNumber = sc.nextInt();	
		try{
			System.out.print(tenRandomIntegers[indexNumber]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println ("Array Index is Out Of Bounds");
		}
	}	
}