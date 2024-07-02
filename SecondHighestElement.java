package JavaProgramme;
import java.util.*;
public class SecondHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch[]=new int[5];
		System.out.println("Enter the element in the Array");
		for(int i=0;i<5;i++)
		{
			ch[i]=sc.nextInt();
		}
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					int temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("Enter the number for Highest");
		int number=sc.nextInt();
		for(int i=0;i<ch.length;i++)
		{
			if(i==(number-1))
			{
				System.out.println("The Number is "+ch[i]);
			}
		}

	}

}
