package practice;
public class MethodOverloading {
	public int addNumbers(int no1, int no2) {
		return no1 + no2;
	}
	public double addNumbers(double no1, double no2) {
		return no1 + no2;
	}
	public int addNumbers(int no1, int no2, int no3) {
		return no1 + no2 + no3;
	}
	public double addNumbers(int no1, double no2) {
		return no1 + no2;
	}
}
