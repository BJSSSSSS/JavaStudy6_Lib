

package com.byeon.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		
		String str = "봄,16,여름,32,가을,20,겨울,-15";
		//str = "봄, 여름, 가을, 겨울";
		// 만약 위에 기준이 ","가 아니라면 replaceAll을 사용해서 다 ,로 만들어주는 전처리 작업을 해준다
		String [] s = str.split(",");

		StringTokenizer st = new StringTokenizer(str , ",");
		
		ArrayList<SeasonDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {//token이 더 있는지를 물어보고 있으면 true 없으면 false!
			
			SeasonDTO seasonDTO = new SeasonDTO();
			
			String token = st.nextToken().trim(); //봄, 여름, 가을, 겨울
			seasonDTO.setName(token);
			
			token = st.nextToken();//16 ,32, 20, -15 - 계속 사용이 가능해서 token을 또 사용한것임
			seasonDTO.setTemp(Integer.parseInt(token.trim()));
			
			ar.add(seasonDTO);
		}
		
		for(int i=0; i<ar.size(); i++) {
			//SeasonDTO seasonDTO = ar.get(i); //ar.get(i)는 바로 seasonDTO의 주소를 의미한다!
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getTemp());
			
		}
		
		
	}
	
}


