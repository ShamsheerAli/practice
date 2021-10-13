package practice;

public class MethodsInJava {

	public static void main(String[] args) {
		addOfNumbers(10,20);
		subOfNumbers(20,10);
		multiOfNumbers(10,5);
		divisionOfNumbers(100,20);
		}
	    public static void addOfNumbers(int num1,int num2) {
		int reult=num1+num2;
		System.out.println(reult);
	}
	    public static void subOfNumbers(int num1,int num2) {
	    	int result=num1-num2;
	    	System.out.println(result);
	    }
	    public static void multiOfNumbers(int num1,int num2) {
	    	int result=num1*num2;
	    	System.out.println(result);
	    }
	    public static void divisionOfNumbers(int num1,int num2) {
	    	if(num2!=0) 
	    	{
	    	  int result=num1/num2;
	    	  System.out.println(result);
	    	}
	    }
}
