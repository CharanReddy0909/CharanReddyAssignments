package practicePackage;

public class Last_Character_In_Every_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hey3 Java   Learners";
		int l=s.length();
		String res="";
		for(int i=0;i<s.length();i++)
		{
			
				if(s.charAt(i)==' '&& s.charAt(i-1)!=' ' && Character.isLetter(s.charAt(i-1)))
				{
					res=res+s.charAt(i-1);
					
				}
			
		}
		if(Character.isLetter(s.charAt(l-1))){
			res=res+s.charAt(l-1);
			
		}
		System.out.println(res);
	}

}

