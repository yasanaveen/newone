package JavaPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;



public class Practice {

	public static void main(String[] args) {

		/*	String str="naveen yasa";
		String[] rev=str.split(" ");

		for(int i=0;i<=str.length()-1;i++)
		{
			if(i==0)
			{
				System.out.print(rev[1]+" ");
			}
			else if(i==1)
			{
				System.out.print(rev[0]+" ");
			}
		} */


		/*	String str="naveenyasa automation testengineer";
		char firstcharacter=str.charAt(0);
		int count=0;

		for(int i=0;i<=str.length()-1;i++)
		{
			if(firstcharacter==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println("firstcharacter:- "+firstcharacter+" is Repeats "+count+" times");
		 */

		/*for(int i=2;i<=10;i++)
		{
			boolean isPrime=true;

			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i);
			}
		}
		 */

		/*String str="naveen";

		Set<Object> set = new LinkedHashSet<Object>();

		for(int i =0;i<=str.length()-1;i++)
		{
			set.add(str.charAt(i));
		}
		for(Object c:set)
		{
			System.out.print(c);
		}*/

		/*String str="naveen";
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
		}*/

		//		ArrayList set= new ArrayList();
		//		
		//		set.add(1);
		//		set.add(7);
		//		set.add(6);
		//		set.add(7);
		//		set.add(9);
		//		Collections.sort(set);
		//		System.out.println(set);



		/*String str="Naveen";
		int vowels=0;
		int consonents=0;

		for(int i=0;i<=str.length()-1;i++)
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
		 */

		//		String str="naveen";
		//		
		//		Set<Object>set=new LinkedHashSet<Object>();
		//		
		//		for(int i=0;i<=str.length()-1;i++)
		//		{
		//			set.add(str.charAt(i));
		//		}
		//		
		//		for(Object c:set)
		//		{
		//			System.out.print(c);
		//		}

		//		for(int i=2;i<=10;i++)
		//		{
		//			boolean isPrime=true;
		//			
		//			for(int j=2;j<=Math.sqrt(i);j++)
		//			{
		//				if(i%j==0)
		//				{
		//					isPrime=false;
		//					break;
		//				}
		//			}
		//			if(isPrime)
		//			{
		//				System.out.print(i);
		//			}
		//		}

		//String str="yasa naveen";
		//		String[] rev=str.split(" ");
		//		
		//		for(int i=0;i<=str.length()-1;i++)
		//		{
		//			if(i==0)
		//			{
		//				System.out.print(rev[1]+" ");
		//			}
		//			else if(i==1)
		//			{
		//				System.out.print(rev[0]+" ");
		//			}
		//		}

		//		String rev="";
		//		for(int i=str.length()-1;i>=0;i--)
		//		{
		//			rev=rev+str.charAt(i);
		//		}
		//			System.out.println(rev);

		//		String str="Yasa Naveen";
		//		String[] rev=str.split(" ");
		//		
		//		for(int i=0;i<=str.length()-1;i++)
		//		{
		//			if(i==0)
		//			{
		//				System.out.print(rev[1]+" ");
		//			}
		//			else if(i==1)
		//			{
		//				System.out.print(rev[0]+" ");
		//			}
		//		}

		//		String str="naveen";
		//		boolean isPalindrome=true;
		//		
		//		for(int i=0;i<=str.length()-1;i++)
		//		{
		//			if(str.charAt(i)!=str.charAt(str.length()-1-i))
		//			{
		//				isPalindrome=false;
		//				break;
		//			}
		//		}
		//			
		//		if(isPalindrome)
		//		{
		//			System.out.println("The Given String is Palindrome");
		//		}
		//		else
		//		{
		//			System.out.println("The Given String is Not Palindrome");
		//		}


		//		String str="naveen";
		//		int count=0;
		//		
		//		for(int i=0;i<=str.length()-1;i++)
		//		{
		//			count++;
		//		}	
		//		System.out.println(count);

		//		String str="Yasa Naveen Naidu";
		//		String[] rev=str.split(" ");
		//		
		//		for(int i=0;i<=str.length()-1;i++)
		//		{
		//			if(i==0)
		//			{
		//				System.out.print(rev[1]+" ");
		//			}
		//			else if(i==1)
		//			{
		//				System.out.print(rev[2]+" ");
		//			}
		//			else if(i==2)
		//			{
		//				System.out.println(rev[0]+" ");
		//			}
		//		}

		/*for(int i=2;i<=10;i++)
			{
				boolean isPrime=true;

				for(int j=2;j<=Math.sqrt(i);j++)
				{
					if(i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
				{
					System.out.print(i);
				}
			}

			String str="naveen";
			String rev="";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			System.out.println(rev);
		 */
		
//		String str ="naveen";
//		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
//		for(int i=0;i<=str.length()-1;i++)
//		{
//			set.add(str.charAt(i));
//		}
//		for(Object c:set)
//		{
//			System.out.print(c);
//		}
		
		/*String str="yasa naveen automation test engineer";
		char firstcharacter=str.charAt(1);
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==firstcharacter)
			{
				count++;
			}
		}
		
		System.out.println(firstcharacter +" Repeats "+count+" Times");
		*/
		
	   /* String str="naveen";
	    char ch[]=str.toCharArray();
	    
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
	
		String str="naveen";
		
		Set<Object>set=new LinkedHashSet<>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			set.add(str.charAt(i));
		}
		
		for(Object c:set)
		{
			System.out.print(c);
		}
		
		String str="yasa naveen naidu";
		String[]  rev=str.split(" ");
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(i==0)
			{
				System.out.print(rev[1]+" ");
			}
			else if(i==1)
			{
				System.out.print(rev[2]+" ");
			}
			else if(i==2)
			{
				System.out.print(rev[0]+" ");
			}
		}*/
		
		/*String str="naveenyasa";
		int vowels=0;
		int consonents=0;
		
		for(int i=0;i<=str.length()-1;i++)
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
		
		String str="yasa naveen";
		String[] rev=str.split(" ");
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(i==0)
			{
				System.out.print(rev[1]+" ");
			}
			else if(i==1)
			{
				System.out.print(rev[0]+" ");
			}
		}
	
          for(int i=2;i<=10;i++)
          {
        	  boolean isPrime=true;
        	  
        	  for(int j=2;j<=Math.sqrt(i);j++)
        	  {
        		  if(i%j==0)
        		  {
        			  isPrime=false;
        			  break;
        		  }
        	  }
        	  if(isPrime)
        	  {
        		  System.out.print(i);
        	  }
          }
	
		int a[]= {2,5,3,2,7,4,4,9};
		
		Set<Object>set=new LinkedHashSet<Object>();
		
		for(int i=0;i<=a.length-1;i++)
		{
			set.add(a[i]);
		}
		
		for(Object c:set)
		{
			System.out.print(c);
		}
		
		int []arr=new int[] {1,5,2,7,9,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]);  
		} */
		
//		int[] arr=new int[] {1,2,3,3,4};
//		
//		Set<Object> set=new LinkedHashSet<Object>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			set.add(arr[i]);
//		}
//		for(Object c:set)
//		{
//			System.out.print(c);
//		}
		 
		/*String str="naveen yasa";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		 System.out.println(rev);     
		
		
		int[] arr = new int[] { 1, 4, 7, 8, 9, 2, 3, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]);
		}
		*/
		
		
		
		
		
		
		





































	}

}
