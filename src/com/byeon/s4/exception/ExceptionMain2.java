


package com.byeon.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 10;
		int result = 0;
		
		try {
			result = num2/num1;
		} catch (Exception exception) {
			//세부적인 컨트롤 작성은 어려움
			
			exception.printStackTrace();// 이걸 꼭 써줘야 나중에 에러가 뜰때 왜인지 안다!
			//잊지말자
			
			
			System.out.println("0이 들어옴");
			num1 = 1;
		}
		
		result = num2/num1;
		System.out.println(result);

	}

}



