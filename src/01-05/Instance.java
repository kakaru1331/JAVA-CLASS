/*
 * 1. new Vs static
 * 2. static °øÀ¯ 
 * 3. new
 * 4. singleton
 */
public class Instance {

	public static void main(String[] args) {
		Person2 p1 = new Person2("Alice");
		
		System.out.println(p1.name);
		System.out.println(p1.getName());
		
		Person2 p2 = new Person2("Clara");
		System.out.println(p2.name);
		System.out.println(p2.getName());
		
		
		StaticPerson p3 = new StaticPerson("Coca");
		StaticPerson p4 = new StaticPerson("Pepsi");
		System.out.println(p3.getName());
		System.out.println(p4.getName());
		
		
//		SelfPerson p5 = new SelfPerson(); // Stack Overflow
		
	}

}
