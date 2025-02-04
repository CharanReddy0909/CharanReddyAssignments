//Write a Java program to print the characters at the odd position of a given string
package practicePackage;

public class Character_At_Odd_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hey there";
		String s1="";
		
		for(int i=1;i<s.length();i=i+2)
		{
			s1=s1+s.charAt(i);
		}
System.out.println(s1);
	}

}
