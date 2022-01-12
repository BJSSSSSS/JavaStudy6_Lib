

package com.byeon.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	
	private Scanner sc;
	
	public WrapperEx1() {
		sc = new Scanner(System.in);
	}
	
	public void ex2() {
		
		//키보드로부터 주민등록번호 입력
		//991224-1234567
		//011224-1234567
		//011224-3234567
				
		//System.out.println("주민번호를 입력하시오 : ");
		//String jumin = sc.next();
		String jumin = "971224-1234567";
				
		//키보드로부터 주민등록번호 입력(하나씩 뺴놓자 문자로 바꿔서)
		//  9  3  0  2  2  3  - 1  0  7  0  4  1     8 - 마지막 번호는 체크용 번호
		//* 2  3  4  5  6  7  - 8  9  2  3  4  5 
		// 18  9  0  10 12 21 - 8  0 14  0 16  5  
		// 결과를 모두 더함 ex)    122
		
		int source = 2;
		int sum = 0;
		
		//----------------- 1 -------------------
//		for(int i=0; i<jumin.length()-1; i++) {
//			String result = jumin.substring(i,i+1); //1,2  2,3
////			if(result.equals("-")) {
////				continue;
////			} //이것도 가능
//			if(!result.equals("-")) {
//				System.out.println(Integer.parseInt(result));
//			}
//		}

		//----------------- 2 -------------------
		for(int i=0; i<jumin.length()-1; i++) {
			
			char ch = jumin.charAt(i);
			//Integer.parseInt(""+ch); //이것도 가능
			if(ch != '-') {
				int num = Integer.parseInt(String.valueOf(ch));
				sum += num*source++;
				if(source >9) {
					source = 2;
				}
			}
			
		}//for 끝
		
		System.out.println(sum);
		
		//2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		//    122/11   -> 11 ...1
		
		sum = sum%11;

		//3. 11로 나눈 나머지 값을 11에서 뺴고 그 값을 체크용 번호와 같은지 비교
		//   11 - 1 = 10 == 7
		
		sum = 11-sum;
		if(sum>9) {
			sum = sum%10;
		}
		
		//4. 만약에 결과값이 두자리라면 결과값을 다시 10으로 나누어서 그 나머지 값을
		//   체크용 번호랑 같은지 비교
		//	 10 / 10 --- 0 == 7
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
		
		int check = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		System.out.println(check);
		System.out.println(sum);
		
		if(sum == check) {
			System.out.println("Ok");
		}else {
			System.out.println("Fail");
		}

	}
	
	

	
	
	
	public void ex1() {
		//키보드로부터 주민등록번호 입력
		//991224-1234567
		//011224-1234567
		//011224-3234567
		
		//System.out.println("주민번호를 입력하시오 : ");
		//String jumin = sc.next();
		String jumin = "971224-1234567";
		
		
		//--------- 연도 파싱 시작 ------------
		//나이 계산(현재년도에서 출생년도 빼기)
		int year = 0;
		int age = 0;
		
		//971224-1234567
		String y = jumin.substring(0,2);
		System.out.println(y);
		year = Integer.parseInt(y);
		
//		char ch1 = jumin.charAt(0);//'9'
//		char ch2 = jumin.charAt(1);//'7'
//		String y =""+ch1 + ch2;
//		System.out.println(y);
		
		String s = jumin.substring(7,8);
		int ss = jumin.charAt(7);
		// 여러 방법이 가능!
		int preYear = 2000;
		
		if(s.equals("1") || s.equals("2")) {
			preYear = 1900;
		}
//		
//		switch(s) {
//		case "1", "2":
//			break;
//		default:	
//		}
		
		
//		if(ss='1' || ss=='2') {
//			preYear = 1900;
//		}
		
		year = preYear + year;
		age = 2022-year;
		
		System.out.println("Age : " + age);
		
		// --------- 연도 파싱 끝 ------------
		
		// --------- 성별 파싱 시작 ------------
		//남자? 여자? 출력

		String se = "Woman";
		if(ss%2 == 1) {
			se = "Man";
		}
		System.out.println("성별 : " + se);
		// --------- 성별 파싱 끝 ------------
		
		
		// --------- 계절 파싱 시작 ------------
		
		//3-5  : 계절 봄
		//6-8  :    여름
		//9-11 :    가을
		//12-2 :    겨울
		
		String result = "";
		int season = Integer.parseInt(jumin.substring(2,4));
		if(season>=3 && season<=5) {
			result = "봄";
		}else if(season>=6 && season<=8) {
			result = "여름";
		}else if(season>=9 && season<=11) {
			result = "가을";
		}else {
			result = "겨울";
		}
		
		System.out.println("당신이 태어난 계절은 ? : " + result);
		
		
		
		
		
		

		// --------- 계절 파싱 끝 ------------
		
	}
	
}


