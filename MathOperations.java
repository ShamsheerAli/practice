package practice;

public class MathOperations {
     private int no1;
     private int no2;
     private static int stacticvariable=10;
   public MathOperations(int no1,int no2) {
	   this.no1=no1;   
	   this.no2=no2;                 /*it indicates that the value which comes from the
	                                  main class is this value by using "this" keyword*/ 
	}
    public int addOfTwoNumbers() {
    	return this.no1+this.no2;
    }
    public static int getMyStaticVariable() {
    	return stacticvariable*5;
    }
    public int subOfTwoNumbers() {
    	return this.no1-this.no2;
    }
    public int multiOfTwoNumbers() {
    	return this.no1*this.no2;
    }
	public double squareOfNumber1() {
		return Math.sqrt(this.no1);
   }
	public double squareOfNumber2() {
		return Math.sqrt(this.no2);
	}
}
