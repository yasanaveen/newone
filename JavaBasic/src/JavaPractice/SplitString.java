package JavaPractice;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="naveen naidu yasa";
		
		String[] rev=str.split(" ");
		
		for(int i=0;i<=rev.length;i++)
		{
			if(i==0)
			{
				System.out.print(rev[2]+" ");
			}
			else if(i==1)
			{
				System.out.print(rev[0]+" ");
			}
			else if(i==2)
			{
				System.out.println(rev[1]+" ");
			}
		}
		
		
		
		
		
		

	}

}
