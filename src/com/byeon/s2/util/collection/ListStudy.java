

package com.byeon.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	
	private final int NUM=1;
	
	public void study3() {
		//123
		//generic - 배열처럼 같은타입을 모으겠다 <> 안에는 reference타입만 가능!
		//ArrayList<E> 변수명 = new ArrayList<E>();
		//E = Integer
		ArrayList<Integer> ar2 = new ArrayList<>();
		//add(E e)
		ar2.add(2);
		ArrayList<String> ar3 = new ArrayList<>();
		ar3.add("iu");
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		//ar.add('b');  다른 데이터 타입을 넣을수 없어지고 Integer타입만 가능해진다
		//ar.add(3.12);
		//ar.add("iu");
		
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		Object obj = 1;
		//obj = "iu";
		int n = (Integer)obj; //모든 object가 int가 아니니까 object 타입중에서 int로 형변환 해줘야함

		int num = ar.get(0);
		//String name = (String)ar.get(0);
		
	}
	
	

	public void study2() {
		ArrayList ar = new ArrayList();
		
		int num = 1;
		Integer n = num; //autoBoxing 다형성
		ar.add(n);//원래는 integer의 n이 들어가는게 맞는데 num은 인트타입이지만 강제형변환이 됐기에 가능
		ar.add(num);	 //autoBoxing 다형성
		
		ar.add('a');	 //autoBoxing(Character 클래스로) 다형성
		
		ar.add(3.12);	 //autoBoxing(Double 클래스로) 다형성
		
		ar.add("name");  //다형성
		
		String k = "iu"; //String의 부모 타입은 Object(String is a Object)
		Object obj = k;  //obj안에는 String 타입인 k가 집어 넣어진다 // 다형성
		
		
	}
	
	
	
	public void study1() {
		int [] numbers = new int [2];
		ArrayList ar = new ArrayList(); //기본 10칸
		
		//대입
		numbers[0] = 1;//넣고싶은 칸이 정해져 있음
		numbers[1] = 2;

		ar.add(1);//0  넣고싶은만큼 넣을 수 있음
		ar.add(2);//1
		ar.add(3);//2
		ar.add(1, 100);//1번자리에 껴넣음
		ar.set(0, 2000);//0인덱스의 1을 2000으로 수정
		ar.remove(0);//0인덱스를 삭제
		ar.clear();
		
		System.out.println(numbers[0]);
		//System.out.println(ar.get(0));
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("List 출력");
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
	}
	
}


