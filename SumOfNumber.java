package Module1;
import java.util.Scanner;
public class SumOfNumber {
	public static void main(String[] args) 
	{
		int sum=0,n=5;
		float avg;
		System.out.println("Enter 5 numbers to find their sum: ");
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=n;i++)
			{
			int j=sc.nextInt();
			sum=sum+j;
			}
		avg=sum/n;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		sc.close();
	}
}
