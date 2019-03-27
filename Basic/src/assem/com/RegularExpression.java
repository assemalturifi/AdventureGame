package assem.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main (String args[]) {
		
		String str="java is the programing lang";
		
		String pattern=".*Java.*";
		
		boolean isMatch=Pattern.matches(pattern, str);
		
		System.out.println(isMatch);
		
		
		
		Pattern par=Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
		
		
		System.out.println(par);
		
		System.out.println("==============");
		
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		  
		//3rd way  
		boolean b3 = Pattern.matches(".s", "as");  
		  
		System.out.println(b+" "+b2+" "+b3);  
		
		
		
		
		
		
		
		
		
	}

}
