

package com.byeon.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {//있으면 true, 없으면 false
			int num = it.next();
			System.out.println(num);
		}
		
		
		
	}
	
	
	public void study3() {
		//Random
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
		
		//Lotto 번호를 랜덤 1-45 6개를 모두 뽑고
		
		while(hs.size() != 6) {
			int num = random.nextInt(45)+1;
			hs.add(num);
		}
		
//		for(int i=0; i<6; i++) {
//			int num = random.nextInt(45)+1;
//			hs.add(num);
////			if(hs.size() != i+1) {
////				i = i-1;
////			}
//		}
		
		//한꺼번에 출력
		System.out.println(hs);
	}

	public void study2() {
		//Random
		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<>();
		
		//Lotto 번호를 랜덤 1-45 6개를 모두 뽑고
		for(int i=0; i<6; i++) {
			int num = random.nextInt(45)+1; // 0 ~ 10 미만의 랜덤 수 생성!
			ar.add(num);
			
			for(int j=0; j<i; j++) {
				if(ar.get(i) == ar.get(j)) {
					ar.remove(i);
					i=i-1;
				}
			}
		}

		//한꺼번에 출력
		System.out.println(ar);
	}
	
	
	
	
	
	
	
	
	
	
	public void study1() {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2); //Object타입 리턴이므로 인덱스 번호는 아니라는 뜻
		System.out.println(hs); //참조변수를 찍는데 주소가 나오는게 아니고 값이나옴
								//toString() 이 호출될때 오버라이딩되어 있다는 뜻이다.
		System.out.println(hs.size());
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		System.out.println(ar);
		
		
	}
	
	
	
	
	
	
}


