package practice;

import java.util.Scanner;

public class SpecialCharectors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		String s = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				count++;
				if (count > 0)
					s += str.charAt(i);
			}
		}
		if (count == 0) {
			System.out.println("Special Characters Not Found");
		} else
			System.out.println("special Characters found: " + count + " --> " + s);
	}

}
