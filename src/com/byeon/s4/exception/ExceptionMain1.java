


package com.byeon.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력");
		int num = 200;
		try {
			int age = sc.nextInt(); //ten
			//throw new InputMismatchException();
			
			
			int result = num/age; //0
			//throw new ArithmeticException(); 예외도 클래스고 객체를 만들어서 사용
			//컴퓨터가 예외가 발생시 자동으로 생성해준다!
	
		
		System.out.println("Age : " + age);
		System.out.println("Result : " + result);
		
		}catch (InputMismatchException exception) {
			System.out.println("숫자만 입력하세요");
		}catch(ArithmeticException exception) {
			System.out.println("0으로 나눌 수 없어요");
		}catch(Exception exception) {
			System.out.println("알수없는 예외 발생");
		}catch(Throwable exception) {
			System.out.println("모든 예외는 여기서 처리");
		}

	}

}



