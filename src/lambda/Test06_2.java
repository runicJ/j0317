package lambda;

// 람다식을 이용하여 제곱값을 구하시오

// 함수적 인터페이스 만듦(람다식 쓰려면 만들어야 함)
@FunctionalInterface
interface MyFunc6_2{
	int calc(int x);  // 내용은 없고 생성만, 처리는 구현클래스에서 사용 // 만들 수 있는 추상메소드는 1개
}

// 원넓이를 람다식으로 구하시오.
@FunctionalInterface
interface MyFunc6_2_2{
	int calc(int r);
}

@FunctionalInterface
interface MyFunc6_2_3{
	double calc(int r);
}

public class Test06_2 {
	public static void main(String[] args) {
//		MyFunc6 myFunc6 = new MyFunc6() {  // 람다식으로 안하면 원래 이렇게함 (익명 이너 클래스)	
//			@Override
//			public int calc(int x) {
//				return x * x;
//			}
//		};
		
		MyFunc6_2 myFunc6_2 = (x) -> x * x;		
		System.out.println("5의 거듭제곱 : " + myFunc6_2.calc(5));
		
		MyFunc6_2_2 myFunc6_2_2 = (r) -> (int)(r * r * 3.14);
		System.out.println("반지름 5인 원넓이 : " + myFunc6_2_2.calc(5));
		System.out.println("반지름 10인 원넓이 : " + myFunc6_2_2.calc(10));
		System.out.println();
		
		MyFunc6_2_3 myFunc6_2_3 = (r) -> r * r * Math.PI;
		System.out.println("반지름 5인 원넓이 : " + myFunc6_2_3.calc(5));
		System.out.println("반지름 10인 원넓이 : " + myFunc6_2_3.calc(10));
	}
}
