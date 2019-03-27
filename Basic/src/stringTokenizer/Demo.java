package stringTokenizer;

import java.util.StringTokenizer;

public class Demo {

	
	
	public static void main(String []arg)
	{ 
		StringTokenizer str=new StringTokenizer("Java is the programming lang");
	     
		System.out.println("number of tokens:"+str.countTokens());
		
		while(str.hasMoreTokens())
		{
			System.out.println("next token:" +str.nextToken());
		}
		System.out.println("=====================");
	
		while(str.hasMoreElements())
		{
			System.out.println("next Element:" +str.nextElement());
		}
		
		System.out.println("=====================");
		
		StringTokenizer strtkn=new StringTokenizer("Java/is/the/programming/lang");
		while(strtkn.hasMoreTokens())
		{
			System.out.println("next token:" +strtkn.nextToken("/"));
		}
		System.out.println("=====================");
		
		
		String str5="Java,is,the,programming,lang";
		String delims=",";
		
		StringTokenizer strtkn5=new StringTokenizer(str5,delims);
		while(strtkn5.hasMoreElements())
		{
			System.out.println("next token:" +strtkn5.nextElement());
		}
		System.out.println("=====================");
		
		String[] token=str5.split(delims);
		int x=token.length;
		for(int i=0;i<token.length;i++)
		{
			System.out.println("Spilit Tokens"+token[i]);
		}


		
		
		
	}
}
