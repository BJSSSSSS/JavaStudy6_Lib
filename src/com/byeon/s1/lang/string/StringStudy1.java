

package com.byeon.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	
	public void splitTest() {
		String name = "iu, suji, choa, 펭수, 춘식이";

		String [] names = name.split(",");
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i].trim());
		}
		
//		String[]
//		split(String regex)
		
	}
	
	
	public void valueTest() {	
		int num = 1000;
		String result = String.valueOf(num); //형변환이네
		System.out.println(result);
	}
	
	
	public void caseTest() {
		
		String title = "West Side Story";
		String result = title.toLowerCase();
		String result1 = title.toUpperCase();
		
		System.out.println(title);
		System.out.println(result);
		System.out.println(result1);
		
	}
	

	
	public void replaceTest() {
		
		String title = "West Side Story";
		//참조변수명.멤버메서드명
		
		String result = title.replace("West", "North");
		
		System.out.println(title);
		System.out.println(result);
		
	}
	
	
	

	public void subStringEx1() {
		//키보드로부터 업로드할 파일명을 입력
		//a.txt, b.pdf, iu.jpg
		//jpg, gif, png -> 이미지파일입니다 출력
		//txt, pdf, hwp -> 문서파일입니다 출력
		//mp3, wav, ogg -> 음원파일입니다 출력
		//나머지는 알 수 없는 파일입니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("업로드할 파일명을 입력해주세요! : ");
		String file = sc.next(); //abc.txt
		
		String find = file.substring(file.lastIndexOf(".")+1);
		
		if(find.equals("jpg") || find.equals("gif") || find.equals("png")) {
			System.out.println("이미지 파일");
		}else if(find.equals("txt") || find.equals("pdf") || find.equals("hwp")) {
			System.out.println("문서 파일");
		}else if(find.equals("mp3") || find.equals("wav") || find.equals("ogg")) {
			System.out.println("음원 파일");
		}else {
			System.out.println("알 수 없는 파일입니다.");
		}
	}		
		
//		String [] st = new String[9];
//
//		st[0] = "jpg";
//		st[1] = "gif";
//		st[2] = "png";
//		st[3] = "txt";
//		st[4] = "pdf";
//		st[5] = "hwp";
//		st[6] = "mp3";
//		st[7] = "wav";
//		st[8] = "ogg";
//	
//		int count = 0;
//		
//		for(int i = 0; i<9; i++) {
//			if(find == st[i]) {
//				count = i;
//			}
//		}
//		if(count == 0) {
//			System.out.println("이미지 파일입니다.");
//		}else if(count == 1) {
//			System.out.println("이미지 파일입니다.");
//		}else if(count == 2) {
//			System.out.println("이미지 파일입니다.");
//		}else if(count == 3) {
//			System.out.println("문서 파일입니다.");
//		}else if(count == 4) {
//			System.out.println("문서 파일입니다.");
//		}else if(count == 5) {
//			System.out.println("문서 파일입니다.");
//		}else if(count == 6) {
//			System.out.println("음원 파일입니다.");
//		}else if(count == 7) {
//			System.out.println("음원 파일입니다.");
//		}else if(count == 8) {
//			System.out.println("음원 파일입니다.");
//		}

//	}
	

	public void subStringTest() {
		
		String title = "West Side Story";
		//String result = title.substring(5);
		String result = title.substring(title.indexOf("St")); // S를 찾아서 해당 인덱스부터 출력
		String result1 = title.substring(5, 9);
		String result2 = title.substring(title.indexOf("S"), title.length());
		                                                     //이렇게도 가능
		//String result1 = title.substring(title.indexOf("S"), title.indexOf("y")+1); 
		                                                     // S를 찾아서 해당 인덱스부터 출력
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}
	
	
	
	public void lengthTest() {
		
		String title = "West Side Story";
		int num = title.length();
		//System.out.println(num);
		//한글자씩 출력
		//W
		//e
		//s
//		for(int i=0; i<num; i++) {
//			System.out.println(title.charAt(i));
//		}
		
		String find = "Side";
		//title find에 들어가있는 글자가 몇개 인지 출력
		
		String [] st = new String[num];
		int count = 0;
		
		for(int i=0; i<num; i++) {
			int index = title.indexOf(find,i);
			if(index >= 0) {
				count++;
				i = index;
			}else {
				break;
			}
		}
		System.out.println("Count : " + count);
	}
	
	
	
	public void indexOfTest() {
		
		String message = "Hello World";
		// reference, 지역변수, 참조변수
		int num = message.indexOf('o',7+1); //int ch = 'W';
		// primitive, 지역변수 - 참조변수는 아니다!
		System.out.println(num);
	}
	
	
	
	public void equalTest() {
		
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu"); // new String 생략 가능!
		String str4 = new String("iu");
		
		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str2 == str3);
		System.out.println(str == str3);
		System.out.println("====================");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str4));
		
		
		
//		System.out.println("str: " + str);
//		System.out.println("str2: " + str2);
//		System.out.println(str == str2);
//		System.out.println(str.equals(str2));
		
	}
	
	
	public void Study1(){
		String name = "hello"; //  'h' 'e' 'l' 'l' 'o'
		int i = 4;
		//charAt 메서드 호출 코드 작성
		char ch = name.charAt(i);
		
		System.out.println(name);
		System.out.println(ch);
		

	}
	
}


