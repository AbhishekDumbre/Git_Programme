package JavaProgramme;
import java.util.*;

public class OccuranceOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch[]=new int[6];
		System.out.println("ENter the element in the array");
		for(int i=0;i<6;i++)
		{
			ch[i]=sc.nextInt();
		}
		
		for(int i=0;i<ch.length;i++)
		{ 
			 for(int j=i+1;j<ch.length;j++)
			 {
				 if(ch[i]>ch[j])
				 {
					 int temp=ch[i];
					 ch[i]=ch[j];
					 ch[j]=temp;
				 }
			 }
		}
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(i==(ch.length-1))
			{
				System.out.println("the number is"+ch[i]);
				System.out.println("the count is"+count);
				break;
			}
			else if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				System.out.println("the count is"+ch[i]);
				System.out.print(count);
				count=1;
			}
		}
	}

}
