package a.b.c;

public class A {

	public static void main(String[] args) {
		int j = 100;
		A tmpA = new A();
		B tmpB = new B();
		
		tmpA.methodA(j);
		System.out.println(j);
		
		tmpA.methodA(tmpB);
		System.out.println(tmpB.b);
	}
	
	public void methodA(int i) {
		i -= 10;
		System.out.println(i);
	}

	public void methodA(B b) {
		b.b -= 10;
		System.out.println(b.b);
	}
	
	public void methodAA() {
		
	}
	

}
