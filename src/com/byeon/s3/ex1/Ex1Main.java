

package com.byeon.s3.ex1;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.byeon.s3.ex1.member.MemberDTO;
import com.byeon.s3.ex1.member.MemberData;
import com.byeon.s3.ex1.student.StudentDTO;
import com.byeon.s3.ex1.student.StudentData;

public class Ex1Main {

	public static void main(String[] args) {
		
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		
		//회원들의 정보 모음
		List<MemberDTO> ar = memberData.init();
		Map<String, StudentDTO> map = studentData.addStudent(ar);
		//지금 여기에 나온 값은 hs야
		//map으로 받아준다 왜냐 부모클래스로 받으면 다형성이 좋기 때문
		//나는 hashmap으로 받아버려서 강제 형변환을 해줬어야 했다!
		//System.out.println(map);
		Set<String> keys = map.keySet();
		Iterator<String> k = keys.iterator();

		while(k.hasNext()) {
			String key = k.next();
			StudentDTO studentDTO = map.get(key);
			System.out.println("Key : " + key);
			System.out.println(studentDTO.getId());
			System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getKor());
			System.out.println(studentDTO.getEng());
			System.out.println(studentDTO.getMath());
			System.out.println(studentDTO.getTotal());
			System.out.println(studentDTO.getAvg());
			System.out.println("====================");
		}
		
	}

}











