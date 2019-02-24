package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			for(int i = 10; i > 0; i--) {
				System.out.println(s);
			}
		}, "repeat");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				if(i % 2 == 0) {
					System.out.println(s);
				}else {
					System.out.println(s.toUpperCase());
				}
			}
		}, "repeat");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
				System.out.println(".");
			}
		}, "repeat");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
		printCustomMessage((s)->{
			String voweless = "";
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
					voweless+=s.charAt(i);
				}
			}
			for(int i = 0; i < 10; i++) {
				System.out.println(voweless);
			}
		}, "repeat");
		
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
