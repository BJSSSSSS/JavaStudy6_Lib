

package com.byeon.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy_my {

	public static void main(String[] args) {
		
		String str = "봄,16,여름,32,가을,20,겨울,-15";
		//str = "봄, 여름, 가을, 겨울";
		// 만약 위에 기준이 ","가 아니라면 replaceAll을 사용해서 다 ,로 만들어주는 전처리 작업을 해준다
		String [] s = str.split(",");
	
		SeasonDTO [] seasonDTOs = new SeasonDTO[4];
		
		int i = 0;
		StringTokenizer st = new StringTokenizer(str , ",");
		
		while(st.hasMoreTokens()) {//token이 더 있는지를 물어보고 있으면 true 없으면 false!
			
			SeasonDTO seasonDTO = new SeasonDTO();
			
			String token = st.nextToken().trim(); //봄, 여름, 가을, 겨울
			seasonDTO.setName(token);
			
			token = st.nextToken();//16 ,32, 20, -15 - 계속 사용이 가능해서 token을 또 사용한것임
			seasonDTO.setTemp(Integer.parseInt(token.trim()));
			
			seasonDTOs[i] = seasonDTO;
			i++;
		}
		
		System.out.println(seasonDTOs[0].getName());
		System.out.println(seasonDTOs[0].getTemp());
	}
	
}


