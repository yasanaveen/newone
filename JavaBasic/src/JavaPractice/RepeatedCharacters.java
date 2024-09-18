package JavaPractice;

public class RepeatedCharacters {

	public static void main(String[] args) {

		String str="naveen yasa is a automation test engineer";
		char firstcharacter=str.charAt(0);
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==firstcharacter)
			{
				count++;
			}
		}
		System.out.println(firstcharacter+" Repeats "+count+" times"); 
		
		
		
	}

}
