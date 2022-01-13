

package com.byeon.s3.ex1;


import java.util.HashMap;
import java.util.List;

import com.byeon.s3.ex1.member.MemberDTO;
import com.byeon.s3.ex1.member.MemberData;
import com.byeon.s3.ex1.student.StudentDTO;
import com.byeon.s3.ex1.student.StudentData;

public class Ex1Main1_my {

	public static void main(String[] args) {
		
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		HashMap<String, StudentDTO> map = new HashMap<>();
		
		//회원들의 정보 모음
		List<MemberDTO> ar = memberData.init();
		map = (HashMap<String, StudentDTO>) studentData.addStudent(ar);
		//지금 여기에 나온 값은 hs야
		
		for(int i=0; i < map.size(); i++) {
				StudentDTO stu = new StudentDTO();
				stu = map.get(ar.get(i).getId());
				//map.get(ar.get(i).getId()) 여기까지는 studentDTO의 주소 불러오기
				//뒤에 getAvg()는 값을 불러오기
				System.out.println("ID : " + stu.getId());
				System.out.println("NAME : " + stu.getName());
				System.out.println("KOR : " + stu.getKor());
				System.out.println("ENG : " + stu.getEng());
				System.out.println("MATH : " + stu.getMath());
				System.out.println("TOTAL : " + stu.getTotal());
				System.out.println("AVG : " + stu.getAvg());
				System.out.println();
		}
			

	}
		
		
}




