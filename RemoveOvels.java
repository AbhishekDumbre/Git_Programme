package JavaProgramme;
import java.util.*;
public class RemoveOvels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int size=ch.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='s')
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
