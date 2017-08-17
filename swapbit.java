package swap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swapbit {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int n1=Integer.parseInt(br.readLine());
		//String temp;
	//	for(int i=0;i<a;i++)
	//	{
			n=n^n1;
			n1=n^n1;
			n=n^n1;
	//	}
		System.out.println(n+" "+n1);
		
		
	}

}
