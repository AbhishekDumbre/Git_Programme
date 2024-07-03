package JavaProgramme;
import java.util.*;

public class FibonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lmit of fibonic series");
		int limit=sc.nextInt();
		int Fib1=0,fib2=1,result;
		System.out.println(Fib1);
		System.out.println(fib2);
		for(int i=0;i<limit;i++)
		{
			result=Fib1+fib2;
			Fib1=fib2;
			fib2=result;
			System.out.println(result);
		}
		

	}

}
