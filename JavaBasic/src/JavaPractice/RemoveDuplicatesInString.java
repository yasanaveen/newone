package JavaPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="naveenyasa";
		
		Set<Character>set=new LinkedHashSet<Character>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			set.add(str.charAt(i));
		}
         for(Character c:set)
         {
        	 System.out.print(c);
         }
	}

}
