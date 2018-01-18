package a.b.c;

import java.util.ArrayList;
import java.util.List;

public class SampleJB {

	public static void main(String[] args) {
		List list = new ArrayList();
		JB jb1 = new JB("삼성전자", "UHD-TV", 500000);
		JB jb2 = new JB("엘지전자", "트롬세탁기", 600000);
		
		list.add(jb1);
		list.add(jb2);
		
		System.out.println("회사: " + jb1.getLabel() + " | 제품명: " + jb1.getProuct() + " | 가격: " + jb1.getPrice());
		System.out.println("회사: " + jb2.getLabel() + " | 제품명: " + jb2.getProuct() + " | 가격: " + jb2.getPrice());

	}

}
