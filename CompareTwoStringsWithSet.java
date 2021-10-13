package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class CompareTwoStringsWithSet {

	public static void main(String[] args) {
         String str1="shamsheer";
         String str2="shannu";
         Set<Character> charset=new LinkedHashSet<Character>();
         for(int i=0; i<str1.length();i++) {
        	 for(int j=0; j<str2.length(); j++) {
        		 if(str1.charAt(i)!=str2.charAt(j) )
        		 charset.add(str1.charAt(i));   
        	 }
         }
         System.out.println("Common Characters: "+charset);
	}

}
