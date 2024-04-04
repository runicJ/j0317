package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다. (함수는 리턴값이 1개 값을 넘기는 메소드를 1개)
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.  // 이게 있어야지 람다식을 자바에서 사용 가능

@FunctionalInterface
interface MyFunc4 {
	int add(int x, int y);
}

public class Test04 {
	public static void main(String[] args) {		
		MyFunc4 myFunc4 = new MyFunc4() {  // 지금까지 쓰던 익명 이너 클래스로 사용
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myFunc4.add(40, 50);
		System.out.println("res : " + res);
	}
}
