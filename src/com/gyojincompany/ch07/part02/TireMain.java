package com.gyojincompany.ch07.part02;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire;
		
		tire = new KumhoTire(); //자동 형변환 -> upcasting
		// tire.tireCompanyKumho -> 자식 필드인 tireCompanyKumho는 사용 불가
		
		// Tire tire2 = new Tire();
		//HankookTire hankook;
		KumhoTire kumho2;
		kumho2 = (KumhoTire) tire; //강제 형변환 -> downcasting
		
		kumho2.tireName = "스노우 타이어"; //부모 필드 사용 가능
		
		
//		a = 10;
//		int a;
	}

}
