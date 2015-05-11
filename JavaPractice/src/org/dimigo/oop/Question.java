package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args)
	{
		System.out.println("우리반에서 제일 키 큰 친구는?");
		Scanner scanner = new Scanner(System.in);
		String answer= scanner.nextLine();
		if(answer.equals("홍영택")) System.out.printf("세상에 맞앗네 ㄷㄷ\n\n");
		else System.out.printf("그것도 모르냐..");
		System.out.println("우리반에서 제일 몸무게 나가는 친구는?");
		answer= scanner.nextLine();
		if(answer.equals("박건")) System.out.printf("세상에 맞앗네 ㄷㄷ\n\n");
		else System.out.printf("그것도 모르냐..");
		System.out.println("우리반에서 제일 노래 잘하는 친구는?");
		answer= scanner.nextLine();
		if(answer.equals("정희조")) System.out.printf("세상에 맞앗네 ㄷㄷ\n\n");
		else System.out.printf("그것도 모르냐..");
	}
}
