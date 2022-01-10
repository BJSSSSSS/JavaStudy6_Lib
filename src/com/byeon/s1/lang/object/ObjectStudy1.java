

package com.byeon.s1.lang.object;

public class ObjectStudy1 {

	//생성자가 없으면 컴파일러가 기본생성자를 만들어줌
	//기본생성자는 매개변수가 없는 생성자
	
	public void study1() {
		System.out.println("Study1 실행");
	
		//Object 객체를 생성하고 주소출력
		Object object = new Object();
		System.out.println(object);
		
		//clone 호출
		//참조변수명.멤버
		//object.clone();
		
		int num = object.hashCode();
		System.out.println(num);
	
		String st = object.toString();
		System.out.println(st);
	
	}
	
	
	
	
	
}


