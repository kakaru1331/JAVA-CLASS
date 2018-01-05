
public class SelfPerson {
	
	// #2
	private static SelfPerson p = new SelfPerson();
	
	// #1
//	static SelfPerson p;
	
	private SelfPerson() {
		
	}
	
	static SelfPerson getInstance() {
//		#1
//		if (p == null) {
//			p = new SelfPerson();
//		}
		return p;
	}
	
}
