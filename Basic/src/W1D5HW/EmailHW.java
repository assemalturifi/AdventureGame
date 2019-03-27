package W1D5HW;

import java.util.regex.Pattern;

public class EmailHW {
	public static void main(String[] args) {
		String emailAddress= "assemaltutifi@gmail.com";
		
		System.out.println(isRightEmail(emailAddress) );
		
		System.out.println("===========");
		
		String passcode="AssemAssem122";
		
		System.out.println(isPasscodeRight(passcode));
		
System.out.println("===========");
		
		String passport="AASS23";
		
		System.out.println(isPassport(passport));
		
		
		
		
		
	}
	public static boolean isRightEmail(String word) {
		String a="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		
		Pattern emailAddresspattern=Pattern.compile(a);
		
		if(emailAddresspattern.matcher(word).matches()) {
			
			return true;
		}
		
		else {
			System.out.println("The email address you entered is incorrect");
			return false;
		}
	}
	
	public static boolean isPasscodeRight(String passcode) {
		String a="((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})";
		
		Pattern passcodePattern=Pattern.compile(a);
		
		if(passcodePattern.matcher(passcode).matches()) {
			return true;
		}
		else {
			System.out.println("The passcode you entered is incorrect");
			return false;
		}
	}
	
	public static boolean isPassport(String passport) {
		String a="^(?!^0+$)[a-zA-Z0-9]{3,20}$";
		
		Pattern passcodePattern=Pattern.compile(a);
		
		if(passcodePattern.matcher(passport).matches()) {
			return true;
		}
		else {
			System.out.println("The passport you entered is incorrect");
			return false;
		}
	}
	
}
