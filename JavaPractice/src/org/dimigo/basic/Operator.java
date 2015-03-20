package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		double a=9,b=10,a2=9,h2=5.4,h=5.8,c,d;
		c=(a+b)*h*0.5;
		d=a2*h2;
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + c);
		System.out.println("평행사변형 넓이 : " + d);
		if(c>d) System.out.println("사다리꼴이 평행사변형보다 "+(c-d)+" 더 큽니다.");
		else if(c<d) System.out.println("평행사변형이 사다리꼴보다 "+(d-c)+" 더 큽니다.");
		else System.out.println("평행사변형과 사다리꼴의 넓이는 같습니다.");
	}
}
