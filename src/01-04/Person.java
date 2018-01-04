
public class Person {
	
	String name;
	int age;
	
	
	Person() {		
		this("Jack", 19);		
	}
	
	Person(String name) {
		this(name, 19);
	}
	
	Person(int age) {
		this("Jack", age);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
