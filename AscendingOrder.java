package JavaProgramme;
import java.util.*;
import java.lang.*;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int ch[]=new int[6];
        System.out.println("Enter the number in Array");
        for(int i=0;i<6;i++)
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
        for(int i=0;i<ch.length;i++)
        {
        	System.out.println(ch[i]);
        }
	}

}
