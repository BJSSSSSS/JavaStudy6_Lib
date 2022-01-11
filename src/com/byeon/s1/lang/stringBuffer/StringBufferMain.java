

package com.byeon.s1.lang.stringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		// iu lee
		StringBuffer sb = new StringBuffer();
		sb.append("iu");
		sb.append("lee");
		
		System.out.println(sb.toString());
		
		String name = "iu";
		String name2 = "lee";
		name = name+name2;
		System.out.println(name);
		
		name = sb.toString();
		System.out.println(name);

	}

}


