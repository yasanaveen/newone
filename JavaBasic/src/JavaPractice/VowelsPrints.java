package JavaPractice;

public class VowelsPrints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="naveen";
		int vowels=0;
		int consonents=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else
			{
				consonents++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonents);

		
		
	}

}
