
public class Calc2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 5;
		
		Calc calculator = Calc.getInstance();
		
		
		System.out.println(calculator.sum(a, b));
		System.out.println(calculator.sum(a, b, c));
		System.out.println(calculator.sub(a, b));
		
		System.out.println(Calc.mul(a, b));

	}

}
