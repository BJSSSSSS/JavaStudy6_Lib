

package com.byeon.s4.exception;

public class ChildException extends Exception{

	public ChildException() {
		super();
	}
	
	public ChildException(String message) {
		super(message);//개발자가 손봐줘야함, 상속받은 자식클래스의 생성자가 호출되면 부모클래스의 생성자도
		//호출되어야 되기 때문에 다 손봐줘야한다!
	}
	
	
}


