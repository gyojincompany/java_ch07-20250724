package com.gyojincompany.ch07.part01;

public class Triangle extends Shape {

	@Override //annotation
	public double area() {
		double area = this.width * height * 0.5;		
		return area;
	}
	
	
//	public double area() { //메소드 오버라이딩
//		double area = this.width * height * 0.5;		
//		return area;
//	}	
	
}
