package JavaProgramme;
import java.util.*;

public class ReverceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String words[]=str.split(" ");
		String reverceString="";
		 for(int i=0;i<words.length;i++)
		 {
			 String word=words[i];
			 String reverceword="";
			 for(int j=word.length()-1;j>=0;j--)
			 {
				 reverceword = reverceword + word.charAt(j);

			 }
			 reverceString = reverceString + reverceword +" ";
		 }
		 System.out.println(str);
		 System.out.println(reverceString);

	}

}
