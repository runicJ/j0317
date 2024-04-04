package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다. (함수는 리턴값이 1개 값을 넘기는 메소드를 1개)
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.  // 이게 있어야지 람다식을 자바에서 사용 가능

@FunctionalInterface  // 함수식임을 알림
interface MyFunc1 {
	int add(int x, int y); // public static 생략  // 인터페이스는 {}없음
}  // 먼저 이렇게 만들어 놔야함

public class Test01 {
	public static void main(String[] args) {  // 자바에서는 메소드 다른 언어에서는 함수 => 람다식을 함수처럼 표현
		
	}
}
