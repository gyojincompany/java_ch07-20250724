package com.gyojincompany.ch07.part01;

public class Animal {
	
	String name;
	int age; //동물 나이
	String sound; //짖는 소리
	int legCount; //다리 수
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		this.name = name;
		this.age = age;
	}

	public Animal(String sound, int legCount) {
		super();
		this.sound = sound;
		this.legCount = legCount;
	}

	public Animal(String name, int age, String sound, int legCount) {
		super();
		this.name = name;
		this.age = age;
		this.sound = sound;
		this.legCount = legCount;
	}




	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	public void bark() {
		System.out.println("짖는 소리:" + this.sound);
	}
}
