

package com.byeon.s1.lang.ex1;

public class MemberData {

	private String data;
	
	//기본 생성자 선언
	public MemberData() {
		
		this.data = "id1 - pw1 - name1 - id1@gmail.com -";
		this.data = this.data+"id2 - pw2 - name2 - name2@naver.com -";
		this.data = this.data+"id3 - pw3 - name3 - name3@daum.net -";
		this.data = this.data+"id4 - pw4 - name4 - name4@daum.net";
		//System.out.println(this.data);
		
	}
	
//	String result = title.substring(title.indexOf("St"))
	
	public MemberDTO [] init(){ 
		
		//this.data
		String [] datas = this.data.split("-");
		MemberDTO [] memberDTOs = new MemberDTO[datas.length/4];
		
		int index = 0;
		
		
		for(int i=0; i<memberDTOs.length; i++) {
			
			MemberDTO memberDTO = new MemberDTO();
			
			memberDTO.setId(datas[index].trim());			//datas[0] [4] [8]
			memberDTO.setPw(datas[++index].trim());		//datas[1] [5] [9]
			memberDTO.setName(datas[++index].trim());		//datas[2] [6] [10]
			memberDTO.setEmail(datas[++index].trim());		//datas[3] [7] [11]
			memberDTOs[i] = memberDTO;
			index++;
		}
		
		return memberDTOs;
				
	}
	
	
	
}





