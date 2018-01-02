
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prev = 1;
		int now = 1;
		int ret = 0;
		
		System.out.println(prev);
		System.out.println(now);
		for (int i = 0; i < 10; i++) {						
			ret = prev + now;
			System.out.println(ret);
			prev = now;
			now = ret;			
		}
	}
}
