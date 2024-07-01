package JavaProgramme;
import java.util.*;
import java.lang.*;

public class ReverceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=1;
		while(number>0)
		{
			int rem=number%10;
			sum=sum*10+rem;
			number=number/10;
		}
		System.out.println("the reverce number is"+sum);

	}

}
