package lambda;

// 람다식을 이용하여 입력받은 수들 중에서 최대값/최소값을 구하시오.

@FunctionalInterface  // 함수적 인터페이스
interface ExFunc01 {
	int[] calc(int[] su);  // 몇 개를 받을지 모르니까 배열로 받음
}
public class Ex01 {
	public static void main(String[] args) {
		
		ExFunc01 exFunc01 = (su) -> {  // 매개 변수는 1개
			int max = su[0], min = su[0];  // to read 방식 => 첫번째 값을 주고 들어가는 것  // 최대, 최소값 부여
			for(int i=1; i<su.length; i++) {
				if(su[i] > max) max = su[i];
				else if(su[i] < min) min = su[i];				
			}
			int[] res = new int[2];
			res[0] = max;
			res[1] = min;
			
			return res;  // 중괄호 쓰면 return을 써야 하고 함수는 값을 1개 밖에 못 넘김 // 값을 2개 이상 쓰려면 배열이나 객체 써야함
		};
		
		// 처리 루틴... 원래 scanner로 받는 것
		int[] su = {10,5,15,2,8,20,7,16,9,13};  // 위에 있으면 안되고 밑에 둬야 사용 가능
		
		int[] res = exFunc01.calc(su);
		System.out.println("최대값 : " + res[0]);
		System.out.println("최소값 : " + res[1]);
	}
}
