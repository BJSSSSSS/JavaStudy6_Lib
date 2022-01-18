

package com.byeon.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("Client 입니다.");
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("192.168.219.100", 8282);
			System.out.println("서버와 접속이 성공!!!");
			System.out.println("서버로 보낼 메세지 입력");
			String message = sc.nextLine();
			System.out.println(message); //hello -> h, e, l, l, o -> 01
			
			//1. output Stream을 구해오기
			OutputStream os = socket.getOutputStream();//bite(bit처리)
			OutputStreamWriter ow = new OutputStreamWriter(os);//char(문자 처리)
			BufferedWriter bw = new BufferedWriter(ow);
			//전송 준비 끝
			
			//전송
			bw.write(message+"\r\n");
			//강제로 버퍼 비우기
			bw.flush();
			
			InputStream is = socket.getInputStream(); //01 처리
			InputStreamReader ir = new InputStreamReader(is);//char
			BufferedReader br = new BufferedReader(ir);//String
			
			message = br.readLine();
			System.out.println("Server : " + message);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}


