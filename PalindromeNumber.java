package JavaProgramme;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0;
		int num2=number;
		while(number>0)
		{
			int rem=number%10;
			sum=sum*10+rem;
			number=number/10;
		}
		if(sum==num2)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Not palindrome Number");
		}

	}

}
