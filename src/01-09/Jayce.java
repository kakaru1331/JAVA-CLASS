package impl;

import ext.Champ;
import itfc.Skill;

public class Jayce extends Champ implements Skill {
	String name = "제이스";
	int hp = 600;
	int mp = 200;
	boolean passive = true;
	
	@Override
	public String skillP() {
		if(passive) {			
			return "[캐논] 마법공학 축전기: 관통";
		} else {			
			return "[해머] 마법공학 축전기: 추가 데미지";
		}		
	}

	@Override
	public String skillQ() {
		if(passive) {
			return "전격 폭발";
		} else {		
			return "하늘로!";
		}		
	}

	@Override
	public String skillW() {
		if(passive) {		
			return "초전하";
		} else {			
			return "전류 역장";
		}	
	}

	@Override
	public String skillE() {
		if(passive) {		
			return "가속 관문";
		} else {			
			return "천둥 강타";
		}	
	}

	@Override
	public String skillR() {
		if(passive) {
			passive = false;
			return "머큐리 캐논";
		} else {
			passive = true;
			return "머큐리 해머";
		}
	}
	
	@Override
	public String introduce() {
		return super.introduceSelf(name) 
				+ "진보는 나의 힘!";
	}		
	
}
