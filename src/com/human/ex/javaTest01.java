package com.human.ex;

public class javaTest01 {

	/*
	 * 여러 줄 주석이라고 함.
	 * 여러 줄 써도 상관없어서 버그 안남.
	 * 열면 반드시 닫을 것.
	 * 단축키 일람
	 * 컨트롤 + Home = 커서 기준으로 공백 처음으로 영역선택 이동
	 * 컨트롤 + End = 커서 기준으로 공백 마지막까지 영역선택 이동
	 * Home, End = 영역 선택하지 않고 커서 기준으로 처음 및 끝으로 이동
	 * 컨트롤 + Shift + 방향키 = 단어 기준으로 이동하면서 영역 선택
	 * 컨트롤 + F = 모두 바꾸기
	 * 컨트롤 + Z = 실행 취소
	 * 컨트롤 + Y = 다시 실행
	 * 컨트롤 + C,V,X = 복, 붙, 짤
	 */
	
	public static void main(String[] args ) {
		System.out.println("hello");
		System.out.println("World");
		System.out.println("hello\tWorld");
		System.out.println("hello\nWorld");
		
		System.out.print("hello");
		System.out.print("World");
		System.out.print("\n");
		
		System.out.print("hello\"World\"");
		
		// "\" = 이스케이프 시퀀스. 양쪽에 붙임으로써 문법 건너뛰기 실행.
		

	}
}
