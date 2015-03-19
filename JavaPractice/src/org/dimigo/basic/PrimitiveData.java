package org.dimigo.basic;

public class PrimitiveData {

	public static void main(String[] args) {
		String a="아이유";
		boolean b=true;
		int c=23;
		double d=161.8;
		float e=44.3f;
		char f='A';
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+a);
		System.out.println("성별 : "+((b)?"여자":"남자"));
		System.out.println("나이 : "+c+" 세");
		System.out.println("키 : "+d+" cm");
		System.out.println("몸무게 : "+e+" kg");
		System.out.println("혈액형 : "+f+" 형");
	}
}