package a.b.c;

import java.util.ArrayList;
import java.util.List;

public class SampleJB {

	public static void main(String[] args) {
		List list = new ArrayList();
		JB jb1 = new JB("�Ｚ����", "UHD-TV", 500000);
		JB jb2 = new JB("��������", "Ʈ�Ҽ�Ź��", 600000);
		
		list.add(jb1);
		list.add(jb2);
		
		System.out.println("ȸ��: " + jb1.getLabel() + " | ��ǰ��: " + jb1.getProuct() + " | ����: " + jb1.getPrice());
		System.out.println("ȸ��: " + jb2.getLabel() + " | ��ǰ��: " + jb2.getProuct() + " | ����: " + jb2.getPrice());

	}

}
