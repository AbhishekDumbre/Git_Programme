package JavaProgramme;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int temp=number;
		int number2=number;
		int digits=0,sum=0;
		while(temp>0)
		{
			temp=temp%10;
			digits++;
		}
		while(number>0)
		{
			int last=number%10;
			sum=(int)(sum + Math.pow(last, digits));
			number=number/10;
		}
		
		if(sum==number2)
		{
			System.out.println("given number is armstrong");
			
		}
		else
		{
			System.out.println("given number not armstrong number");
		}
		
	}
}
