package practice;
public class Test {
	public static void main(String[] args) {
		MathOperations object = new MathOperations(225, 49);
		int addition = object.addOfTwoNumbers();
		int subtraction = object.subOfTwoNumbers();
		int multiplication = object.multiOfTwoNumbers();
		double sqofno1 = object.squareOfNumber1();
		double sqofno2 = object.squareOfNumber2();
		System.out.println("Addition of two numbers: " + addition);
		System.out.println("Subtraction of two numbers: " + subtraction);
		System.out.println("multiplication of two numbers: " + multiplication);
		System.out.println("the square root of no1: " + sqofno1);
		System.out.println("the square root of no2: " + sqofno2);

		// ....................METHOD OVERLOADING....................//
		MethodOverloading ob = new MethodOverloading();
		int result = ob.addNumbers(10, 20);
		double result1 = ob.addNumbers(25.5, 45.8);
		int result2 = ob.addNumbers(12, 83, 28);
		double result3 = ob.addNumbers(92, 76.4);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
