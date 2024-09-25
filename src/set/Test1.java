package set;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(methodReturningValue());	

		Set set = new HashSet();
		set.add("B");
		set.add("A");
		set.add("A");
		set.add("C");
		set.add(null);
		set.add(null);
		System.out.println(set.toString());
		
		System.out.println(checksAnagram("mary", "army"));

	}
	
	   static int methodReturningValue(){
		   int a;
	       try{
	           a= 10;
	       }
	       catch (Exception e)
	       {
	           a= 20;
	       }
	       finally{
	           a= 30;
	       }
	       return a;
	   }
	   
	   public static boolean checksAnagram(String str1, String str2) {		   
		   return str1.chars().sorted().toArray().equals(str2.chars().sorted().toArray());		   
	   }

}
