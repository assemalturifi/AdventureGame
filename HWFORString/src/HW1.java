import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import org.graalvm.compiler.word.Word;

import sun.util.resources.LocaleData;

public class HW1 {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		

		LocalDate endofCentury = LocalDate.of(2019, 03, 25);
		LocalDate endofCentury2 = LocalDate.of(2019, 03, 26);

		
		
	}
	public static void HW1(String obj) {
		System.out.println("to Add the string to it self, select A");
		System.out.println("to Replace odd positions with #, select R");
		System.out.println("to remove duplicate characters in the String, select rd");
		System.out.println("to change odd characters to upper case, select c");
		
		String userChoice=scanner.nextLine().toLowerCase();
		
		switch(userChoice) {
		case "a":
			String newString=obj+obj;
			System.out.println(newString);
			break;
		case "r":
			String allAlp="BCDFGHJKLMNPQRSTVXZAEIOU0123456789";
			
			for(int i=0;i<obj.length();i++) {
				for(int j=1;j<obj.length()-1;j++) {
					if(obj.charAt(i)!=allAlp.charAt(j)) {
						obj.replace(obj.charAt(i), '#');
					}
					
				}
			
			
			}
			System.out.println(obj);
			break;
		case "rd":
			
			break;
			
			
		}
	}
	//done
	public static boolean HW2(String word) {
		 
			for(int i=0;i<word.length()-1;i++) {
				boolean idk= word.charAt(i)<word.charAt(i+1);
				if(idk!=true) {
					return false;
				}
			}
			return true;
	}
	//done
	public static void HW3(int day,int month,int year) {
		LocalDate endofCentury = LocalDate.of(year, month, day);
		LocalDate now = LocalDate.now();
		 
		Period diff = Period.between(endofCentury, now);
		 
		System.out.printf("Difference is %d years, %d months and %d days ",
		                    diff.getYears(), diff.getMonths(), diff.getDays());
	
		
	}
	public static LocalData HW4(LocalData a1,LocalData a2) {
		
		Period diff = Period.between(a1, a2);
	
		System.out.printf("Difference is %d years, %d months and %d days ",
                diff.getYears(), diff.getMonths(), diff.getDays());
		
	}
	

}
