package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다. (함수는 리턴값이 1개 값을 넘기는 메소드를 1개)
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.  // 이게 있어야지 람다식을 자바에서 사용 가능

@FunctionalInterface
interface MyFunc3 {
	int add(int x, int y);
}

public class Test03 {  // 구현객체 사용하기 귀찮아서 익명 이너클래스로 만들어 쓰고 있었음
	public static void main(String[] args) { 
		MyFunc3 myFunc3 = new MyFunc3() {  // 중첩 인터페이스(메소드 안에서 만들때)
			
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myFunc3.add(10, 20);
		System.out.println("res : " + res);
	}
}
