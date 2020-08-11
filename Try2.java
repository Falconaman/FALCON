
import java.util.*;
import java.lang.Math;
public class Try2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = str.length();
		
		if(!(n % 3 == 0))
			return;
		int count = 0;
		for(int i=0;i<n;i = i+3) //loop for checking first s
		{
			char ch = str.charAt(i);
			if(!(ch == 'S'))
				count++;
		}
		for(int j=1;j<n;j=j+3)
		{
			char ch = str.charAt(j);
			if(!(ch == 'O'))
				count++;
		}
		for(int k=2;k<n;k = k+3)
		{
			char ch = str.charAt(k);
			if(!(ch == 'S'))
				count++;
		}
		System.out.println(count);
	}
}
		