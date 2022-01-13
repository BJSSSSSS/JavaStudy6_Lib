

package com.byeon.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.byeon.s3.ex1.member.MemberDTO;


public class StudentData_my {

	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar){
		//id, name, kor, eng, math, total, avg
		//키보드로부터 member의 수만큼 성적 정보 입력
		//이 정보들을 StudentDTO -> value
		//map의 키는 id
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, StudentDTO> hs = new HashMap<>();
		
		for(int i=0; i<ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setId(ar.get(i).getId());
			studentDTO.setName(ar.get(i).getName());
			
			System.out.println("국어 성적 입력 : ");
			studentDTO.setKor(sc.nextInt());
			
			System.out.println("영어 성적 입력 : ");
			studentDTO.setEng(sc.nextInt());
			
			System.out.println("수학 성적 입력 : ");
			studentDTO.setMath(sc.nextInt());
			
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			
			hs.put(ar.get(i).getId(), studentDTO);
		}
		return hs;
	}
	

	
}


