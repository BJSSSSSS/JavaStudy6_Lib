

package com.byeon.s2.util.collection;

import java.util.HashMap;

public class MapStudy {

	public void study1() {
		//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		
		//put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 1);
		
		System.out.println(map);
		
		//get
		Integer num1 = map.get("f2");
		int num2 = map.get("f2");
		
		System.out.println(num1);
		System.out.println(num2);
		
		//remove
		map.remove("f3");
		System.out.println(map);
		
		map.put("f1", 100);//똑같은 키로 값을 넣으면 수정이 된다!
		System.out.println(map);
	
		//없는 키로 꺼내면
		Integer n = map.get("test"); //이때 int는 에러가뜸 왜냐면 null이 리턴되기때문!
		System.out.println("N : " + n);
		
		String name = "k5";
		map.put(name, null);
		
		//clear
		map.clear();
		System.out.println(map);
	}
	
}












