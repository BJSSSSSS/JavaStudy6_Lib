

package com.byeon.s3.ex1.member;

public class MemberDTO {
	//선언
	//멤버변수의 접근지정자는 모두 private
	//외부에서 접근 가능 하도록 뭔가(setter, getter)를 만들어야 함
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;
	
	//setter set변수명(매개변수로 값을 받아 오고)
	//getter get변수명(return으로 데이터를 반환)
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}



