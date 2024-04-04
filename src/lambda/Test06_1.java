package lambda;

// 람다식을 이용하여 제곱값을 구하시오

// 함수적 인터페이스 만듦(람다식 쓰려면 만들어야 함)
@FunctionalInterface
interface MyFunc6 {
	int calc(int x);  // 내용은 없고 생성만, 클래스로 빼서 사용 // 만들 수 있는 추상메소드는 1개
}

public class Test06_1 {
	public static void main(String[] args) {
		MyFunc6 myFunc6 = new MyFunc6() {  // 람다식으로 안하면 원래 이렇게함 (익명 이너 클래스)
			
			@Override
			public int calc(int x) {
				return x * x;
			}
		};
		
		System.out.println("5의 거듭제곱 : " + myFunc6.calc(5));
	}
}
