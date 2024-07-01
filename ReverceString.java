package JavaProgramme;
import java.util.*;
import java.lang.*;

public class ReverceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int length=ch.length;
		int start=0,end=length-1;
		for(int i=start;i<=end;i++)
		{
			
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			
		}
       System.out.println(ch);
	}

}
