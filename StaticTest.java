package practice;
public class StaticTest {
	public static void main(String[] args) {
		int result = MathOperations.getMyStaticVariable();
		System.out.println(result);

		// ..................Static operations.................//
		StaticOperations ob = new StaticOperations();
		ob.changeVariableValues();
		int result2 = ob.addTwoNumbers();
		// System.out.println("the changed values addition");
		System.out.println("the instance variable value: " + ob.getInstancevariable());
		System.out.println("the static variable value: " + ob.getStaticvariable());
		System.out.println("Addition by method calling: " + result2);
		StaticOperations ob1 = new StaticOperations();
		System.out.println("the instance variable value: " + ob1.getInstancevariable());
		System.out.println("the static variable value: " + ob1.getStaticvariable());
		int result3 = ob1.addTwoNumbers();
		System.out.println("Addition without calling the method: " + result3);
	}

}
