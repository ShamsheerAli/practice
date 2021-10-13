package practice;

public class StringsUsingCommandLine {

	public static void main(String[] args) {
	     String[] str= new String[5];
	     str[0]=args[0];
	     str[1]=args[1];
	     str[2]=args[2];
	     str[3]=args[3];
	     str[4]=args[4];
       for(int i=0;i<str.length;i++)
       {
    	   if(str[i].length()>=3) {
    		  String str2=str[i];
    		  System.out.println(str2);
    	   }
       }
	}

}
