

package com.byeon.s3.ex1;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {

		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> members = memberData.init();
		
		memberData.addMember(members);
		
		
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













