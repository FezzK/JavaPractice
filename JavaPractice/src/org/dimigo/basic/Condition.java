package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		String car="그 외";
		int len=25,hap=0;
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : "+len+"km");
		System.out.println("차종 : "+car);
		if(car=="고속버스") hap=850+((len-1)/10)*300;
		else if(car=="경차") hap=300+((len-1)/10)*200;
		else if(car=="그 외") hap=600+((len-1)/10)*200;
		System.out.println("통행료 : "+hap+"원");
	}
}
