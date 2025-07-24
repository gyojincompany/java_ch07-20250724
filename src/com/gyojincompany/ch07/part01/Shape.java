package com.gyojincompany.ch07.part01;

public class Shape { //부모클래스
	int width;
	int height;
	String color; //도형면의 색깔
	
	public int area() { //도형의 면적 계산 메소드
		int area = width * height;
		return area;
	}
}
