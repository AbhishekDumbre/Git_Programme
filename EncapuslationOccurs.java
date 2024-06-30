package JavaProgramme;
import java.util.*;
class Person
 {
      private String name;
      public String getName()
      {
    	  return name;
      }
      public void setName(String name)
      {
    	  this.name=name;
      }
 }

public class EncapuslationOccurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setName("Abhishek");
		String str=p.getName();
		System.out.println(str);
		

	}

}
