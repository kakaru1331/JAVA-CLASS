
public class Basic2 {

	public static void main(String[] args) {
		/*퀴즈
		 *스타벅스에서 커피를 100잔을 주문합니다.
		 *가격 : 아메리카노(4000), 라떼(5000)
		 *짝수 - 아메리카노, 홀수 - 라떼, 3의 배수 - 10% 할인
		 *각 잔의 가격을 배열 쓰기로 해주세요.
		 */
		int ame = 4000;
		int latte = 5000;
		int sum = 0;
		double[] prices = new double[100];
		for (int i = 1 ; i < 101 ; i++) {
			double price = 0;
			if (1 == i % 2) {
				//라떼
				if(0 == i % 3) {
					//3의 배수
					sum += latte * 0.9;
					price = latte * 0.9;
				} else {
					sum += latte;
					price = latte;
				}
			} else {
				//아메리카노
				if(0 == i % 3) {
					//3의 배수
					sum += ame * 0.9;
					price = ame * 0.9;
				} else {
					sum += ame;
					price = ame;
				}
			}
			prices[i-1] = price;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		

	}
}
