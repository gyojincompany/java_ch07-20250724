package com.gyojincompany.ch07.part02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a; //8byte
		int b=10; //4byte
		a = b; //자동 형변환
		b = (int) a; //강제 형변환
		
//		String c = "100";
//		int d = Integer.parseInt(c); // 문자열을 정수로 변환
		
		Person person = new Person();
		Student student = new Student();
		Soldier soldier = new Soldier();
		
		person = student; //부모는 자식의 모든 것을 받아준다->자동 형변환
		student = (Student) person; //강제 형변환
		// soldier = student;
		
		Person person2 = new Student();
		person2 = new Soldier();
		
		System.out.println("=========================");
		
		Car myCar = new Car();
		
		myCar.carName = "소나타";
		myCar.year = 2010;
		
		myCar.frontTire = new KumhoTire(); 
		
		myCar.rearTire = new HankookTire();
		
		
		
		
				

	}

}
