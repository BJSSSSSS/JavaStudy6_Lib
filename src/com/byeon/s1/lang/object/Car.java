

package com.byeon.s1.lang.object;

public class Car extends Object{ // Object 확장이 숨겨져 있다 안쓰더라도 있는거임!

	@Override
	public String toString() { // toString 메서드는 원래 주소를 출력하는 메서드임!
		
		return "toString Overriding";
	}
	
	
}


