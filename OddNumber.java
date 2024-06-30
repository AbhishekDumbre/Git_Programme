package JavaProgramme;
import java.util.*;

public class OddNumber {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		if(no%2!=0)
		{
			System.out.println("the number is odd");
		}
		else
		{
			System.out.println("the number is Even");
		}
	}
	

}
