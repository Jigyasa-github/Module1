package Module1;
import java.util.Scanner;
public class LargestNo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println("Largest no is:  "+max);
		input.close();
	}
}
