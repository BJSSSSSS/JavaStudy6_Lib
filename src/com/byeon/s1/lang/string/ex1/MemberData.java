

package com.byeon.s1.lang.string.ex1;

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
	
//	String result = title.substring(title.indexOf("St"))
	
	public MemberDTO [] init(){ 
		
		//this.data
		String [] datas = this.data.split("-");
		MemberDTO [] memberDTOs = new MemberDTO[datas.length/5];
		
		int index = 0;
		
		
		for(int i=0; i<memberDTOs.length; i++) {
			
			MemberDTO memberDTO = new MemberDTO();
			
			memberDTO.setId(datas[index].trim());						//datas[0] [5] [10]
			memberDTO.setPw(datas[++index].trim());						//datas[1] [6] [11]
			memberDTO.setName(datas[++index].trim());					//datas[2] [7] [12]
			memberDTO.setEmail(datas[++index].trim());					//datas[3] [8] [13]
			memberDTO.setAge(Integer.parseInt(datas[++index].trim()));	//datas[4] [9] [14]
			memberDTOs[i] = memberDTO;
			index++;
		}
		
		return memberDTOs;
				
	}
	
	
	
}





