

package com.byeon.s1.lang.ex1;

public class MemberMain {

	public static void main(String[] args) {
		//증감연산자
		// ++ i 선행  :  나 자신(i)을 먼저 실행(++)
		// i ++ 후행  :  나 자신(i)을 젤 나중에 실행(++)
		// 단독으로 사용할 떄는 차이가 없음
		//
		//int num = 0;
		//++num; //num=1
		//num++; //num=2
		
		//System.out.println(num++);
		
		//test, 프로그램 실행
		
		MemberData memberData = new MemberData();

		MemberDTO [] members = memberData.init();
		
		for(int i=0; i<members.length; i++) {
			System.out.println("ID : " + members[i].getId());
			System.out.println("PW : " + members[i].getPw());
			System.out.println("Name : " + members[i].getName());
			System.out.println("Email : " + members[i].getEmail());
			System.out.println("Age : " + members[i].getAge());
			System.out.println("======================");
		}
		
		//System.out.println("name : " + "iu " + "age : " + 30);
		

		
		
	}

}













