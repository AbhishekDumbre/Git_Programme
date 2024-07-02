package JavaProgramme;
import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int flag=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Given Number is  Prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}

	}

}
