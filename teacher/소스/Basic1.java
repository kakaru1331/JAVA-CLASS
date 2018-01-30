
public class Basic1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		int a = 10;
		int b = 10;
		int c = a - b;
		System.out.println(c);

		if (c > 0) {
			System.out.println("c는 0보다 큽니다.");
		} else if (c == 0) {
			System.out.println("c는 0입니다.");
		} else {
			System.out.println("c는 0보다 작습니다.");
		}

		System.out.println("나머지:" + 11 % 2);

		for (int i = 0; i < 10; i++) {
			if (i >= 5) {
				if (0 == i % 2) {
					System.out.println(i);
				}
			}
		}
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[] {10,20,30};
		int[] arr3 = new int[3];
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30;
		
		//1~100의 숫자 배열 생성
		int[] nums = new int[100];
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = i + 1;
		}
		
		//배열 읽기
		int sum = 0;
		for (int i = 0 ; i < nums.length ; i++) {
			int num = nums[i];
			if(0 == num % 2) {
				//합을 구함
				sum = sum + num;
				//sum += num;
			}
		}
		/*for ( int num : nums ) {
			//짝수인 경우
			if(0 == num % 2) {
				//합을 구함
				sum = sum + num;
				//sum += num;
			}
		}*/
		
		System.out.println(sum);
		
		
		/*퀴즈
		 *스타벅스에서 커피를 100잔을 주문합니다.
		 *가격 : 아메리카노(4000), 라떼(5000)
		 *짝수 - 아메리카노, 홀수 - 라떼, 3의 배수 - 10% 할인
		 *각 잔의 가격을 배열 쓰기로 해주세요.
		 */
		
		
		
		
		
		
		
		
		
		

	}
}
