package practice;

import java.util.Scanner;

public class InfoOfFamily {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Letter");
       String str1=sc.nextLine();
       switch(str1) {
       case "f":
    	   System.out.println("My Father Name is Shaik.Shabbeir");
    	   System.out.println("His Occupation is Business");
    	   System.out.println("I Am The only son of Him, He also have 2 Waste Daughters");
    	   break;
       case "m":
    	   System.out.println("My Mother Name is Shaik.Shajadi");
    	   System.out.println("She is a House Maker");
    	   System.out.println("She is Innocent And Lovely");
    	   break;
       case "s1":
           System.out.println("My Elder Sister Name is Shaik.Shahanaz Sultana");
           System.out.println("She Got Married With Her Childhood Love Karimulla bhaiji");
           System.out.println("She Had Blessed With Two Babies. Their Names Are:");
           System.out.println("Alina Firdose");
           System.out.println("Mohammad Ashraf");
           break;
       case "s2":
    	   System.out.println("My Younger Sister Name is Shaik.Shabeena Sultana");
    	   System.out.println("She is Studying Intermediate 2nd Year");
    	  // System.out.println("She is a BP patient");
    	   break;
      default:
    	   System.out.println("My Parents Loves Me More Than My Sister!!! ITS A FACT myannn");
       }
	}

}
