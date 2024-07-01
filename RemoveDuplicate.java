package JavaProgramme;
import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int ch[]= new int[size];
		System.out.println("enter the element in the Array");

		for(int i=0;i<size;i++)
		{
			ch[i]=sc.nextInt();
		}
		   for(int i=0;i<size;i++)
		   {
			   for(int j=i+1;j<size;j++)
			   {
				   if(ch[i]==ch[j])
				   {
					   for(int k=j;k<size-1;k++)
					   {
						   ch[k]=ch[k+1];
					   }
					   j--;
					   size--;
				   }
				   }
				   
		   }
		   for(int i=0;i<size;i++)
		   {
		   System.out.println(ch[i]);
		   }

	}
	

}
