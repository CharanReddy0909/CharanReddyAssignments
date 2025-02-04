//Write a Java program to count both vowels and consonants in a given string
package practicePackage;
public class Vowels_Consonants_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=0;
		int c=0;
		String s="Hello World!";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u'  )
			{
				v++;
				
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				c++;
			}
		}
		System.out.println(v);
		System.out.println(c);

		
	}

}
