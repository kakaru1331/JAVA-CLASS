
public class Basic1 {

	public static void main(String[] args) {
		 System.out.println("Hello, World!");

		 int a = 10;
		 int b = 20;
		 int c = a - b;
		 System.out.println(c);
		
		 if(c > 0) {
			 System.out.println("c는 0보다 큽니다.");
		 } else if(c == 0) {
			 System.out.println("c는 0입니다.");
		 } else {
			 System.out.println("c는 0보다 작습니다.");
		 }
		 
//		 else {
//		 if(c == 0) {
//		 System.out.println("c는 0입니다.");
//		 } else {
//		 System.out.println("c는 0보다 크지 않아요.");
//		 }
//		 }

		 System.out.println("나머지: " + 11 % 2);
		 for(int i = 0; i < 10; i++) {
			 if (i >= 5) {
				 if (i%2 == 0) {
					 System.out.println(i);
				 }
			 }
		 }
		
		 int[] arr1 = { 10, 20, 30 };
		 int[] arr2 = new int[] { 30, 20, 10 };
		 int[] arr3 = new int[3];
		
		 arr3[0] = 10;
		 arr3[1] = 20;
		 arr3[2] = 30;

//		할 일 #1 1~100을 담는 배열 생성
//		할 일 #2 배열 중 짝수의 합
//		할 일 #3 결과 출력

		 int[] number = new int[100];
		 int sum = 0;
		
		 for(int i = 0; i < 100; i++) {
			 number[i] = i+1;
		 }
		
		 for(int j = 0; j < 100; j++) {
			 if(number[j]%2 == 0) {
				 sum += number[j];
			 }			
		 }
		 System.out.println(sum);

		/*
		 * int ret = 0; 
		 * for(int val : number) { 
		 * 	if(val%2 == 0) { 
		 * 		ret += val; 
		 * 	} 
		 * }
		 * System.out.println(ret);
		 */		

	}

}
