package impl;

import ext.Champ;
import itfc.Skill;

public class Vayne extends Champ implements Skill {		
	String name = "베인";
	int hp = 525;
	int mp = 200;
		
	@Override
	public String skillP() {		
		return "어둠 사냥꾼";
	}

	@Override
	public String skillQ() {		
		return "구르기";
	}

	@Override
	public String skillW() {
		return "은화살";
	}

	@Override
	public String skillE() {
		return "선고";
	}

	@Override
	public String skillR() {
		return "결전의 시간";
	}

	@Override
	public String introduce() {
		return super.introduceSelf(name) 
				+ "흑마법 냄새가 나는군.";
	}		

	
}
