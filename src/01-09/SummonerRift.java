package lift;

import impl.Jayce;
import impl.Vayne;

public class SummonerRift {

	public static void main(String[] args) {
		Vayne vayne = new Vayne();
		System.out.println(vayne.introduce());
		System.out.println(vayne.skillP());
		System.out.println(vayne.skillQ());
		System.out.println(vayne.skillW());
		System.out.println(vayne.skillE());
		System.out.println(vayne.skillR());
		

		Jayce jayce = new Jayce();
		System.out.println(jayce.introduce());
		System.out.println(jayce.skillR());
		System.out.println(jayce.skillP());
		System.out.println(jayce.skillQ());
		System.out.println(jayce.skillW());
		System.out.println(jayce.skillE());
		
		System.out.println(jayce.skillR());
		System.out.println(jayce.skillP());
		System.out.println(jayce.skillQ());
		System.out.println(jayce.skillW());
		System.out.println(jayce.skillE());	
	}

}
