package JavaPractice;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2;i<=10;i++)
		{
			boolean isPrime=true;
			
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				
				if(i%j==0)
				{
					isPrime=false;
				}
			}
			if(isPrime)
			{
				System.out.print(i);
			}
		}
		
		
	}

}
