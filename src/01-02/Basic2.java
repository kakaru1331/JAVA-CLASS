
public class Basic2 {

	public static void main(String[] args) {
		/*
		 * 퀴즈 
		 * 커피 100잔 주문 
		 * 아메리카노 4000원, 라떼 5000원 
		 * 홀수 번째 주문은 라떼, 
		 * 짝수 번째 주문은 아메리카노 
		 * !!! 3의 배수 번째 주문은 10% 할인
		 */

		int[] coffee = new int[100];
		int americano = 4000;
		int latte = 5000;
		int total = 0;

		for (int i = 0; i < coffee.length; i++) {
			int order = i + 1;
			double coast = 0;

			if (order % 3 == 0) {
				if (order % 2 == 0) {
					coast = americano * 0.9;
					coffee[i] = (int) coast;
					continue;
				} else {
					coast = latte * 0.9;
					coffee[i] = (int) coast;
					continue;
				}
			}

			if (order % 2 == 0) {
				coast = americano;
				coffee[i] = (int) coast;
			} else {
				coast = latte;
				coffee[i] = (int) coast;
			}
		}

		int k = 1;
		for (int val : coffee) {
			total += val;

			System.out.println(k + "번째 주문: " + val);
			k++;
		}
		System.out.println("총 지불 금액: " + total);

		
		
		// 선생님 풀이
		int ame = 4000;
		int lat = 5000;
		int sum = 0;
		for (int i = 1 ; i < 101 ; i++) {
			
			if (1 == i % 2) {
				//라떼
				if(0 == i % 3) {
					//3의 배수
					sum += lat * 0.9;
				} else {
					sum += lat;
				}
			} else {
				//아메리카노
				if(0 == i % 3) {
					//3의 배수
					sum += ame * 0.9;
				} else {
					sum += ame;
				}
			}
		}
		
		System.out.println(sum);
		
	}

}
