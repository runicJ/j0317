package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다. (함수는 리턴값이 1개 값을 넘기는 메소드를 1개)
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.  // 이게 있어야지 람다식을 자바에서 사용 가능

@FunctionalInterface
interface MyFunc5 {
	int add(int x, int y);
}

public class Test05 {
	public static void main(String[] args) {		
//		MyFunc5 myFunc5 = new MyFunc5() {  // 인터페이스 선언 해놓고 생성한 것  // 익명 클래스 안에 내용을 넣어서 익명 이너 클래스
//			@Override  // 위에 정의해놓은 추상클래스 오버라이드
//			public int add(int x, int y) {
//				int res = x + y;
//				return res;
//			}
//		};  // 여기까진 자바고 이제 프론트 처럼 람다식 사용
		
//		MyFunc5 myFunc5 = function() => {  // 자바스크립트 arrow function => 자바에서는 람다식으로 표현
//			
//		}
		
		MyFunc5 myFunc5 = (x, y) -> x + y; // 수행할 내용 // 한줄이라서 {여러줄이면} 지우고 위로 올리고 return 지움  // 이너클래스 코딩을 줄여서 만듦

		int res = myFunc5.add(40, 50);
		System.out.println("res : " + res);
	}
}
