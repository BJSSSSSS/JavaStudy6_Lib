

package com.byeon.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.byeon.s3.ex1.member.MemberDTO;


public class StudentData {

	
	private Scanner sc;
	
	public StudentData() {
		sc = new Scanner(System.in);
	}
	
	
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar){
		//id, name, kor, eng, math, total, avg
		//키보드로부터 member의 수만큼 성적 정보 입력
		//이 정보들을 StudentDTO 객체
		//map의 키는 id
		
		HashMap<String, StudentDTO> hs = new HashMap<>();
		
		for(int i=0; i<ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();
			//id
			//name	
			studentDTO.setId(ar.get(i).getId());
			studentDTO.setName(ar.get(i).getName());
			
			System.out.println("국어 성적 입력 : ");
			studentDTO.setKor(sc.nextInt());
			
			System.out.println("영어 성적 입력 : ");
			studentDTO.setEng(sc.nextInt());
			
			System.out.println("수학 성적 입력 : ");
			studentDTO.setMath(sc.nextInt());
			
			//총점
			//평균
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			
			//map에 추가
			hs.put(studentDTO.getId(), studentDTO);
		}
		
		return hs;
	}
	

	
}


