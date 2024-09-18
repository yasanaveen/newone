package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="naveen";
		String rev="";
		
		/*for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());*/
		
		char[] a=str.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		

	}

}
