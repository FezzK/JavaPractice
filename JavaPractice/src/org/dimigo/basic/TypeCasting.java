package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("<< 디미베네 연간 인건비 >>");
		int a = 1700000;
		int b=3;
		int c= 1500;
		long d=(long)a*12*b*c;
		System.out.println("월 평균 급여 : " + String.format("%,d",a));
		System.out.println("점포 내 직원 수 : " + b);
		System.out.println("점포 수 : " + String.format("%,d",c));
		System.out.println("\n\n연간 인건비 : " + String.format("%,d",d));
	}

}
