package a.b.c;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	
	public static void main(String[] args) {
		BeepTask beeptask = new BeepTask();
		beeptask.run();
	}
	
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try { 
				Thread.sleep(500); 
			} catch(Exception e) {
				
			}  
		}
	}
}
