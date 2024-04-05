package lambda;

@FunctionalInterface
interface MyfuncA3 {
	int calc(int[] su);
}

public class Exam3 {
	public static void main(String[] args) {
		
//		MyfuncA3 myfuncA3 = new MyfuncA3() {
//			@Override
//			public int calc(int[] su) {
//				int min = su[0];
//				for(int i=1; i<su.length; i++) {
//					if(su[i] < min) min = su[i];
//				}
//				return min;
//			}
//		};
		
		MyfuncA3 myfuncA3 = (int[] su) -> {
			int min = su[0];
			for(int i=1; i<su.length; i++) {
				if(su[i] < min) min = su[i];
			}
			return min;
		};
		
		int[] su = {5,1,7,10,9,8};
		
		int min = myfuncA3.calc(su);
		
		System.out.println("최소수 : " + min);
	}
}