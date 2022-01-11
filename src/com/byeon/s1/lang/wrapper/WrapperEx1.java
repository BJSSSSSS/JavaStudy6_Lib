

package com.byeon.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {

	public void ex2() {
		//키보드로부터 주민등록번호 입력(하나씩 뺴놓자 문자로 바꿔서)
		//  9  3  0  2  2  3  - 1  0  7  0  4  1     8 - 마지막 번호는 체크용 번호
		//* 2  3  4  5  6  7  - 8  9  2  3  4  5 
		// 18  9  0  10 12 21 - 8  0 14  0 16  5  
		// 결과를 모두 더함 ex)    122
		
		//2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		//    122/11   -> 11 ...1
		
		//3. 11로 나눈 나머지 값을 11에서 뺴고 그 값을 체크용 번호와 같은지 비교
		//   11 - 1 = 10 == 7
		//4. 만약에 결과값이 두자리라면 결과값을 다시 10으로 나누어서 그 나머지 값을
		//   체크용 번호랑 같은지 비교
		//	 10 / 10 --- 0 == 7
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("주민번호를 입력하시오 : ");
			String zumin = sc.next();
			int checkBox = zumin.length()-zumin.replaceAll("[-*^&%)($#@!=]", "").length();
			if(zumin.length() == 14 && checkBox <=1) {
			
				String result1 = zumin.substring(0,6);
				String result2 = zumin.substring(7,13);
				String result3 = zumin.substring(13);
				
				int num = 2;
				int count = 0;
				int num2 = 8;
				
				for(int i=0; i<result1.length(); i++) {
					count += Integer.parseInt(""+result1.charAt(i))*num++;
				}
		
				for(int i=0; i<result2.length(); i++) {
					count += Integer.parseInt(""+result2.charAt(i))*num2++;
					if(num2 == 10) {
						num2 = 2;
					}else if(num2 == 6) {
						break;
					}
				}
				
				int check = 11-(count%11);
				
				if(check >= 10 && check <=100) {
					check = check%10;
					if(check == Integer.parseInt(result3)) {
						System.out.println("주민번호가 확인되었습니다.");
					}else {
						System.out.println("조작된 주민번호 입니다.");
					}
				}else if(check >= 0 && check <=9) {
					if(check == Integer.parseInt(result3)) {
						System.out.println("주민번호가 확인되었습니다.");
					}else {
						System.out.println("조작된 주민번호 입니다.");
					}
				}else {
					System.out.println("조작된 주민번호 입니다.");
				}
				
				flag = false;
				
			}else {
				System.out.println("주민번호 입력 오류!");
				System.out.println();
			}
		}
		sc.close();
	}
	
	
	public void ex1() {
		//키보드로부터 주민등록번호 입력
		//991224-1234567
		//011224-1234567
		//011224-3234567
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하시오 : ");
		String zumin = sc.next();
		
		//나이를 대충 계산(현재년도에서 출생년도 빼기)
		//앞에서 두개짜르기
		//String zuminYear = zumin.substring(0, 2);
		//int myYear = Integer.parseInt(19+zuminYear);
		
		int myYear = Integer.parseInt(19+zumin.substring(0, 2));
		int currentYear = 2022;
		System.out.println("당신의 나이는 : " + ((currentYear+1) - myYear) + "살 입니다.");
		
		//남자? 여자? 출력
		//- 이후 첫번째만 짜르기
		//String zuminSex = zumin.substring(zumin.indexOf("-")+1, 8);
		//int mySex = Integer.parseInt(zuminSex);
		
		int mySex = Integer.parseInt(zumin.substring(zumin.indexOf("-")+1, 8));
		if(mySex == 1 || mySex == 3) {
			System.out.println("당신은 남자입니다.");
		}else if(mySex == 2 || mySex == 4) {
			System.out.println("당신은 여자입니다.");
		}else {
			System.out.println("당신은 외국인 입니다.");
		}
		
		//3-5  : 계절 봄
		//6-8  :    여름
		//9-11 :    가을
		//12-2 :    겨울
		
//		String zuminBirth = zumin.substring(2, 4);
//		int myBirth = Integer.parseInt(zuminBirth);
		
		int myBirth = Integer.parseInt(zumin.substring(2,4));
		if(myBirth >= 3 && myBirth <=5) {
			System.out.println("당신은 봄에 태어났군요");
		}else if(myBirth >= 6 && myBirth <=8) {
			System.out.println("당신은 여름에 태어났군요");
		}else if(myBirth >= 9 && myBirth <=11) {
			System.out.println("당신은 가을에 태어났군요");
		}else if(myBirth >= 1 && myBirth <=2 || myBirth == 12) {
			System.out.println("당신은 겨울에 태어났군요");
		}else {
			System.out.println("당신은 외계인 입니다.");
		}
		
		System.out.println();
		
		
	}
	
}


