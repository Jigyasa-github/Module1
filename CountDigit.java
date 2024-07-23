package Module1;

public class CountDigit 
{
	public static void main(String[] args)
	{
	int n=123456,count=0;
	while(n>0)
		{
		n=n/10;
		count++;
		}
	System.out.println("Number of Digit: "+count);
	}
}
