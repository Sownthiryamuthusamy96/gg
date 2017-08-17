package swap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swap {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		String n=br.readLine();
		String n1=br.readLine();
		String temp;
	//	for(int i=0;i<a;i++)
	//	{
			temp=n;
			n=n1;
			n1=temp;
	//	}
		System.out.println(n+" "+n1);
		
		
	}

}
