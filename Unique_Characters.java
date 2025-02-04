//Write a Java program to print the unique characters present 
//in the given string in the same sequence as they appear(the first occurrence) in the input.
package practicePackage;
public class Unique_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="xperience";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s1.indexOf(s.charAt(i))==-1)
			s1=s1+s.charAt(i);
		}
		
System.out.println(s1);
	}

}
