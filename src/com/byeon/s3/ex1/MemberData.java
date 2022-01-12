

package com.byeon.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {

	private String data;
	private Scanner sc;
	
	//기본 생성자 선언
	public MemberData() {
		
		this.sc = new Scanner(System.in);
		this.data = "id1 - pw1 - name1 - id1@gmail.com -20-";
		this.data = this.data+"id2 - pw2 - name2 - name2@naver.com -42-";
		this.data = this.data+"id3 - pw3 - name3 - name3@daum.net -36-";
		this.data = this.data+"id4 - pw4 - name4 - name4@daum.net-17-";
		//System.out.println(this.data);
		
	}
	
	
	public MemberDTO removeMember(ArrayList<MemberDTO> ar){//ar안에 멤버들이있다!
		//삭제하고 싶은 ID 입력받아서
		//ArrayList에서 삭제
		
		MemberDTO memberDTO = null;
		System.out.println("삭제 할 아이디를 입력하시오 : ");
		String id = sc.next();
		
		for(int i=0; i<ar.size(); i++) {
			if(id.equals(ar.get(i).getId())) {
				System.out.println("해당 아이디가 삭제되었습니다.");
				memberDTO = ar.remove(i); 
				break;
			}
		}

		return memberDTO; // 삭제할 애를 빼서 리턴해준것임!
						  // 만약 못찾았으면 null이 리턴된다
	}
	
	
	public void addMember(ArrayList<MemberDTO> ar) {
		//새로추가할 MemberDTO 생성
		//키보드로부터 id, pw, name, email, age 입력받아서
		//MemberDTO의 멤버변수 값으로 대입
		//매개변수로 받은 ar에 MemberDTO 추가
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("아이디는? ");
		memberDTO.setId(sc.next());
		System.out.println("비밀번호는? ");
		memberDTO.setPw(sc.next());
		System.out.println("이름은? ");
		memberDTO.setName(sc.next());
		System.out.println("이메일은? ");
		memberDTO.setEmail(sc.next());
		System.out.println("나이는? ");
		memberDTO.setAge(sc.nextInt());		
		
		ar.add(memberDTO);
		
	}
	
	
	
	

	public ArrayList<MemberDTO> init(){ 
		//data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		
		//System.out.println("MemberEx1 Branch");
		
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







