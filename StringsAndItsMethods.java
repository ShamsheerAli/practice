package practice;

public class StringsAndItsMethods {

	public static void main(String[] args) {
		String str1="what is java";              //THE METHODS WHICH WE USE MOSTLY
		char ch=str1.charAt(2);
        System.out.println(ch);
       String result= str1.substring(5);
       System.out.println(result);
       String result2=str1.substring(8, 12);
       System.out.println(result2);
       char[] ch2=str1.toCharArray();
       System.out.println(ch2);
       String[] result3=str1.split(" ");
       System.out.println(result3[1]);
       String result4=str1.concat(" programming");
       System.out.println(result4);
       System.out.println( str1.contains(result4));
       System.out.println(str1.startsWith(str1));
       String result5=str1.replace('w', 'W');
       System.out.println(result5);
       int i=str1.length();
       System.out.println(i);
	}

}
