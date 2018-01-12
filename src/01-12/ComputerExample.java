
public class ComputerExample {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		int[] val1 = { 1, 2, 3 };
		int ret1 = com.sum1(val1);
		System.out.println("ret1: " + ret1);
		
		int ret2 = com.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("ret2: " + ret2);
		
		int ret3 = com.sum2(2, 4, 6);
		System.out.println("ret3: " + ret3);
		
		int ret4 = com.sum2(2, 4, 6, 8, 10);
		System.out.println("ret4: " + ret4);

	}

}
