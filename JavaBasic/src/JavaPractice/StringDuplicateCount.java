package JavaPractice;

public class StringDuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="naveen";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[i]);
				}
			}
		}
		

	}

}
