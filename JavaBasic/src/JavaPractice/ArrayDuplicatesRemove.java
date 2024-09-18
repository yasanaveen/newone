package JavaPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicatesRemove {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,5,7,9,1,2,3,5};
		
		Set<Object> set= new LinkedHashSet<Object>();
		
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
		}

		for(Object c:set)
		{
			System.out.print(c);
		}
		
		
	}

}
