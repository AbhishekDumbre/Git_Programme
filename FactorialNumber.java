
package JavaProgramme;
import java.util.*;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for factorial");
	int number=sc.nextInt();
	int fact=1;
	for(int i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	

	}

}
