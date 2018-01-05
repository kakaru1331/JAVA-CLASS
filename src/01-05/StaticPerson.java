
public class StaticPerson {	
		
		static String name = null;
		
		StaticPerson(String name) {
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
