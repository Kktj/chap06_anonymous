package com.javalab.anonymous.pkg00;
// Tire 객체를 멤버로 갖는 클래스
public class Car {
	// 필드 선언 // 필드 선언(타이어 클래스 타입을 필드로 갖게됨)
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { // 상속관계구현
		@Override
		public void roll() { // 익명 자식 객체
			System.out.println("익명 자식 타이어 객체1이 굴러갑니다."); // 자식이 태어남
		}
	}; // ;이 반드시 들어가야 함
	
	// 메소드 선언
	public void run1() {
		tire1.roll(); // 자식 오버라이드된 메소드 호출
		tire2.roll(); // 자식 오버라이드된 메소드 호출
	}
	
	// 메소드 내에서 익명 구현 객체 생성
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() { // 익명 자식 객체
				System.out.println("익명 자식 객체2가 굴러갑니다."); // 자식이 태어남
			}
		};
		tire.roll();
	}
	
	// 다형성 구현(매개변수의 다형성)
	public void run3(Tire tire) {
		tire.roll();
	}

}
