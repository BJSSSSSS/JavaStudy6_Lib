

package com.byeon.s3.ex1.member;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {

		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> members = memberData.init();
		
		//memberData.addMember(members);
		
		MemberDTO memberDTO = memberData.removeMember(members);
		//이렇게 리턴값을 받아서 밑에 삭제 성공, 실패를 출력해주면 다른 사용자가 하고싶은대로 하는데
		//메서드에서 바로 출력을해버리면 다른 사용자가 하기 어렵다
		
		if(memberDTO != null) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		//memberDTO 가 null이면 memberData클래스 안 메서드에서 건드려진게 아니니까
		//밑에 members가 바뀌지 않는거고
		//memberDTO 가 null이 아닌 메서드에서 값이 바뀌고 리턴이 되면
		//members가 값이 바뀐상태로 호출이 되므로 밑에 members 출력값도 바뀌게 된다
		//이게 증명되는거는 따로 저장상태가 아니기 떄문에
		//메인에서 메서드 호출을 하면 계속 초기화 된 값이 나오는 것임.
		
		for(int i=0; i<members.size(); i++) {
			System.out.println("ID : " + members.get(i).getId());
			System.out.println("PW : " + members.get(i).getPw());
			System.out.println("Name : " + members.get(i).getName());
			System.out.println("Email : " + members.get(i).getEmail());
			System.out.println("Age : " + members.get(i).getAge());
			System.out.println("======================");
		}

		
	}

}













