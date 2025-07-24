package com.gyojincompany.ch07.part01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle();
		rectangle.height = 10;
		rectangle.width = 20;
		rectangle.recArea = 50.5;
		
		System.out.println("=======================");
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("멍멍", 5);
		
		System.out.println("=======================");
		
		Student student = new Student("홍길동", 3, 22);
		
		System.out.println("=======================");
		
		Triangle triangle = new Triangle();
		triangle.width = 10;
		triangle.height = 5;
		triangle.color = "red";
		
		//삼각형의 면적
		System.out.println(triangle.area());
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.area();
		
		
	}

}
