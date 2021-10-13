package practice;
import java.util.Scanner;
public class StringsAndProperties {
	public static void main(String[] args) {
		String str1=new String("shamsheer");
		String str2="ali";
		String str3="10";
		String str4="20";
		System.out.println(str1+str2);
		System.out.println(str3+str4);
		int i1=Integer.parseInt(str3);
		int i2=Integer.parseInt(str4);
		System.out.println(i1+i2);
		System.out.println("enter an alphabet");
		Scanner sc=new Scanner(System.in);
		String str5=sc.nextLine(); 
        switch(str5) {
        case "a":
        	System.out.println("it is a vowel");
        	break;
        case "e":
        	System.out.println("it is a vowel");
        	break;
        case "i":
        	System.out.println("it is a vowel");
        	break;
        case "o":
        	System.out.println("it is a vowel");
        	break;
        case "u":
        	System.out.println("it is a vowel");
        	break;
        default:
        	System.out.println("it is a consonent");
        }
        String s[]= {str1,str2,str3,str4,str5}; 
        for(int i=0;i<s.length;i++)
        {
        	if(s[i].length()>1)
        		System.out.println(s[i]);	
        }
	}
}
