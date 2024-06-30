package JavaProgramme;
import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int sum=0;
        for(int i=1;i<=no;i++)
        {
        	if(no%i==0)
        	{
        		sum=sum+i;
        	}
        }
        if(sum==0)
        {
        	System.out.println("given number is perfect number");
        }
        else
        {
        	System.out.println("the given number is not perfect Number");
        }
	}

}
