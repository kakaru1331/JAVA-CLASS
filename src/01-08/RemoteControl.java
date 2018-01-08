
public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnon();
	void turnoff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("Muted");
		} else {
			System.out.println("Unmuted");
		}
	}
	
	static void changeBattery() {
		System.out.println("changed batteries.");
	}
}
