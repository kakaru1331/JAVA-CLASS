
public class Basic1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		int a = 10;
		int b = 10;
		int c = a - b;
		System.out.println(c);

		if (c > 0) {
			System.out.println("c�� 0���� Ů�ϴ�.");
		} else if (c == 0) {
			System.out.println("c�� 0�Դϴ�.");
		} else {
			System.out.println("c�� 0���� �۽��ϴ�.");
		}

		System.out.println("������:" + 11 % 2);

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
		
		//1~100�� ���� �迭 ����
		int[] nums = new int[100];
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = i + 1;
		}
		
		//�迭 �б�
		int sum = 0;
		for (int i = 0 ; i < nums.length ; i++) {
			int num = nums[i];
			if(0 == num % 2) {
				//���� ����
				sum = sum + num;
				//sum += num;
			}
		}
		/*for ( int num : nums ) {
			//¦���� ���
			if(0 == num % 2) {
				//���� ����
				sum = sum + num;
				//sum += num;
			}
		}*/
		
		System.out.println(sum);
		
		
		/*����
		 *��Ÿ�������� Ŀ�Ǹ� 100���� �ֹ��մϴ�.
		 *���� : �Ƹ޸�ī��(4000), ��(5000)
		 *¦�� - �Ƹ޸�ī��, Ȧ�� - ��, 3�� ��� - 10% ����
		 *�� ���� ������ �迭 ����� ���ּ���.
		 */
		
		
		
		
		
		
		
		
		
		

	}
}
