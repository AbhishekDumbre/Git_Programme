package JavaProgramme;
import java.util.*;
import java.lang.*;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch[]=new int[6];
		System.out.println("ENter the element in the array");
		for(int i=0;i<6;i++)
		{
			ch[i]=sc.nextInt();
		}
         
		int max=ch[0],min=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]<min)
				{
					min=ch[i];
				}
				if(ch[i]>max)
				{
					max=ch[i];
				}
			}
		}
		System.out.println("the max Element is"+max);
		System.out.println("The Minimum Element is"+min);
	}

}
