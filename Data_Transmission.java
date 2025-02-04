//data transmission
package practicePackage;
import java.util.*;
import java.util.Collections;
public class Data_Transmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> q=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		int[] num=new int[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			num[i]=Integer.parseInt(s1[i]);
		}
		for(int j=0;j<num.length;j++)
		{
			if(isPrime(num[j]))
			{
				q.add(num[j]);
			}
		}
		
	
		int m=Collections.max(q);
		int o=q.get(0);
		for(int a=0;a<q.size();a++)
		{
			if(q.get(a)<m && q.get(a)>=o)
			{
				o=q.get(a);
			}
		}
	
		System.out.println(o+q.size());
		sc.close();
	}

	private static boolean isPrime(int p) {
		// TODO Auto-generated method stub
		int c=0;
		for(int k=1;k<=p;k++)
		{
			if(p%k==0)
			{
				c=c+1;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
	

}
