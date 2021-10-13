package practice;

public class FactorialUsingCommandLine {

	public static void main(String[] args) {
      int fact=1;
      int num=Integer.parseInt(args[0]);  /*it will take value from arguments,but arguments
                                           are strings by default. so, we convert them into integers*/
      for(int i=1; i<=num; i++)
      {
    	  fact=fact*i;
      }
    		System.out.println("the factorial of "+num+" is : "+fact); 
	}

}
