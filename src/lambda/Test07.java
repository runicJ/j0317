package lambda;

// 람다식을 이용하여 두 수의 값을 처리하는 사칙연산하는 계산기를 만드시오.
@FunctionalInterface
interface MyFunc7 {
	int calc(int su1, int su2);  // 추상 메소드  // 인터페이스는 정의만 한 것
}

public class Test07 {
	public static void main(String[] args) {
		MyFunc7 add = (su1, su2) -> su1 + su2;
		MyFunc7 sub = (su1, su2) -> su1 - su2;
		MyFunc7 mul = (su1, su2) -> su1 * su2;
		MyFunc7 div = (su1, su2) -> su1 / su2;
		
		System.out.println("2 + 3 = " + add.calc(2, 3));
		System.out.println("2 - 3 = " + sub.calc(2, 3));
		System.out.println("2 * 3 = " + mul.calc(2, 3));
		System.out.println("2 / 3 = " + div.calc(2, 3));
	}
}
