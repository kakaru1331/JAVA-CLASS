
public class Television implements RemoteControl {
	private int volume = 0;
	
	@Override
	public void turnon() {
		System.out.println("Turned on TV");		
	}

	@Override
	public void turnoff() {
		System.out.println("Turned off TV");		
	}

	@Override
	public void setVolume(int volume) {	
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			System.out.println("Exceed value...");
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			System.out.println("negative value...");
		} else {
			this.volume = volume;
		}
		
		System.out.println("Set volume " + volume);
	}
	
}
