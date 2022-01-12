

package com.byeon.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {

	private String data;
	
	//private Scanner sc;
	
	
	
	
	//기본 생성자 선언
	public MemberData() {
		
		this.data = "id1 - pw1 - name1 - id1@gmail.com -20-";
		this.data = this.data+"id2 - pw2 - name2 - name2@naver.com -42-";
		this.data = this.data+"id3 - pw3 - name3 - name3@daum.net -36-";
		this.data = this.data+"id4 - pw4 - name4 - name4@daum.net-17-";
		//System.out.println(this.data);
		
	}

	public void addMember(ArrayList<MemberDTO> ar) {
		//새로추가할 MemberDTO 생성
		//키보드로부터 id, pw, name, email, age 입력받아서
		//MemberDTO의 멤버변수값으로 대입
		//매개변수로 받은 ar에 추가
		
		Scanner sc = new Scanner(System.in);
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("아이디를 입력하시오 : ");
		memberDTO.setId(sc.next());
		System.out.println("비밀번호를 입력하시오 : ");
		memberDTO.setPw(sc.next());
		System.out.println("이름을 입력하시오 : ");
		memberDTO.setName(sc.next());
		System.out.println("이메일을 입력하시오 : ");
		memberDTO.setEmail(sc.next());
		System.out.println("나이를를 입력하시오 : ");
		memberDTO.setAge(sc.nextInt());

		ar.add(memberDTO);
		
	}
	
	
	
	public ArrayList<MemberDTO> init(){ 
		//data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		
		StringTokenizer st = new StringTokenizer(data, "-");
		
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {//token이 더 있는지를 물어보고 있으면 true 없으면 false!
			
			MemberDTO memberDTO = new MemberDTO();
			
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			
			ar.add(memberDTO);
			
		}
		
		return ar;	
		
	}
	
}





