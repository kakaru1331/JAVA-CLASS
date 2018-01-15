package a.b.c;

public class BeepTester {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); // { beef -> sleep(500) } x5 
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ì¿ë");
			try { 
				Thread.sleep(500); 
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
