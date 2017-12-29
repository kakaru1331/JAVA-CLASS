
public class Times_Tables {

	public static void main(String[] args) {
//		for(int i = 1; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, (i*j));	
//			}
//			System.out.println();
//		}
		
//		for(int a = 1; a < 10; a++) {
//			for(int b = 1; b < 10; b++
//		) {
//				System.out.println(String.format("%d * %d = %d", a, b, a*b));												
//			}
//		}
		
		for(int first = 1; first < 10; first += 3) {
			for(int second = 1; second < 10; second++) {
				System.out.println(String.format("%d * %d = %2d    %d * %d = %2d    %d * %d = %2d",
						first, second, first*second, 
						first+1, second, (first+1)*second, 
						first+2, second, (first+2)*second));
			}
			System.out.println();
		}
	}
}