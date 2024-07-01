package JavaProgramme;
import java.util.*;
import java.lang.*;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int flag=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch[ch.length-1-i])
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given String is not Palindrome");
		}

	}

}
