

package com.byeon.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberData {

	private String data;
	
	//기본 생성자 선언
	public MemberData() {
		
		this.data = "id1 - pw1 - name1 - id1@gmail.com -20-";
		this.data = this.data+"id2 - pw2 - name2 - name2@naver.com -42-";
		this.data = this.data+"id3 - pw3 - name3 - name3@daum.net -36-";
		this.data = this.data+"id4 - pw4 - name4 - name4@daum.net-17-";
		//System.out.println(this.data);
		
	}

	public ArrayList<MemberDTO> init(){ 
		//data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		
		System.out.println("MemberEx1 Branch");
		
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			
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







