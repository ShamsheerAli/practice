package practice;
public class StaticOperations {
	private int instancevariable = 10;
	private static int staticvariable = 10;
	public void changeVariableValues() {
		setInstancevariable(20);
		setStaticvariable(20);
	}
	public int addTwoNumbers() {
		return getInstancevariable() + getStaticvariable();
	}
	public int getInstancevariable() {
		return instancevariable;
	}
	public void setInstancevariable(int instancevariable) {
		this.instancevariable = instancevariable;
	}
	public static int getStaticvariable() {
		return staticvariable;
	}
	public static void setStaticvariable(int staticvariable) {
		StaticOperations.staticvariable = staticvariable;
	}
}
