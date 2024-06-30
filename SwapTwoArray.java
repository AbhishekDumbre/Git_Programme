package JavaProgramme;
import java.util.*;

public class SwapTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] First= {10,20,30};
		int[] Second= {40,50,60};
		
		for(int i=0;i<First.length;i++)
		{
			First[i]=First[i]+Second[i];
			Second[i]=First[i]-Second[i];
			First[i]=First[i]-Second[i];
		}
		for(int i=0;i<First.length;i++)
		{
		System.out.print(First[i]);
		}
		for(int j=0;j<Second.length;j++)
		{
		System.out.println(Second[j]);
		}

	}

}
