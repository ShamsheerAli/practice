package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter The First String");
		String str1 = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The Second String");
		String str2 = sc2.nextLine();
		System.out.println("Enter The First Index!");
		int a = sc1.nextInt();
		str1 = str1.substring(a);
		System.out.println("Enter The Last Index!");
		int b = sc2.nextInt();
		str2 = str2.substring(a, b);
		System.out.println(str1);
		System.out.println(str2);
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
	}
}