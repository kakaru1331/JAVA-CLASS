
public class Basic2 {

	public static void main(String[] args) {
		/*����
		 *��Ÿ�������� Ŀ�Ǹ� 100���� �ֹ��մϴ�.
		 *���� : �Ƹ޸�ī��(4000), ��(5000)
		 *¦�� - �Ƹ޸�ī��, Ȧ�� - ��, 3�� ��� - 10% ����
		 *�� ���� ������ �迭 ����� ���ּ���.
		 */
		int ame = 4000;
		int latte = 5000;
		int sum = 0;
		double[] prices = new double[100];
		for (int i = 1 ; i < 101 ; i++) {
			double price = 0;
			if (1 == i % 2) {
				//��
				if(0 == i % 3) {
					//3�� ���
					sum += latte * 0.9;
					price = latte * 0.9;
				} else {
					sum += latte;
					price = latte;
				}
			} else {
				//�Ƹ޸�ī��
				if(0 == i % 3) {
					//3�� ���
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
