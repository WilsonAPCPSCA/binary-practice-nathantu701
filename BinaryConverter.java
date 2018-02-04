import java.util.Scanner;
import java.util.ArrayList;
public class BinaryConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a number and I will convert it to binary");
		int number = in.nextInt();
		convertBinary(number);
	}	
	public static void convertBinary(int num) {
		int binary[] = new int [100];
		int pos = 0;
		while (num>0) {
			binary[pos]=num%2;
			pos++;
			num=num/2;
		}
		for (int i = pos-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
	}
}	

	
	
	
	
	
	
