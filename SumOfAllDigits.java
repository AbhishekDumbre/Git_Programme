package JavaProgramme;
import java.util.*;
public class SumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elemet for Sum");
		int ch[]=new int[6];
		for(int i=0;i<6;i++)
		{
			ch[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			sum=sum+ch[i];
		}
		
		System.out.println("The Sum is"+sum);

	}

}
