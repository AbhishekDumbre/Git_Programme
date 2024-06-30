package JavaProgramme;
import java.util.*;

public class AnagramNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First string");
		String str=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		char[] ch=str.toCharArray();
		char ch1[]=str2.toCharArray();
		 int count=0,count2=0;
		for(int i=0;i<ch.length;i++)
		{
			count++;
			System.out.println(count);
		}
         Arrays.sort(ch);
         Arrays.sort(ch1);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch1[i])
			{
				count2++;
			}
		}
		if(count==count2)
		{
			System.out.println("given String is anagram");
		}
		else
		{
			System.out.println("given string is not anagram");
		}
			
	}

}
