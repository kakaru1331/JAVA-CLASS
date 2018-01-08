package com.joongang.main;

import com.joongang.a501.Person;

public class Starter {

	public static void main(String[] args) {

		Person[] p = new Person[5000];
		for(int i = 0; i < 5000; i++) {			
			Person ps = new Person();
			p[i] = ps;
//			p[i] = new Person();
		}
				
		Person p1 = p[0];
		
	}

}
