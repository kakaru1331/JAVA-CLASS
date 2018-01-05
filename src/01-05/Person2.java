
public class Person2 {
	
	String name = null;
	
	Person2(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void test() {
		System.out.println(this.name);
		System.out.println(getName());
	}
}
