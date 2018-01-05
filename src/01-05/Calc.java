
public class Calc {
	
	private static final Calc calc = new Calc();
	
	private Calc() {
		
	}
	
	static Calc getInstance() {
		return calc;
	}
	
	int sum(int a, int b) {
		return a + b;
	};
	
	int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	int sub(int a, int b) {
		return a - b;
	};
	
	static int mul(int a, int b) {
		return a * b;
	};
}
