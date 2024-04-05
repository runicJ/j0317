package lambda;

@FunctionalInterface
interface MyfuncA2 {
	int calc(int[] su);
}

public class Exam2 {
	public static void main(String[] args) {
		
//		MyfuncA2 myfuncA2 = new MyfuncA2() {
//			@Override
//			public int calc(int[] su) {
//				int max = su[0];
//				for(int i=1; i<su.length; i++) {
//					if(su[i] > max) max = su[i];
//				}
//				return max;
//			}
//		};
		
		MyfuncA2 myfuncA2 = (int[] su) -> {
			int max = su[0];
			for(int i=1; i<su.length; i++) {
				if(su[i] > max) max = su[i];
			}
			return max;
		};
		
		int[] su = {5,1,7,10,9,8};
		
		int max = myfuncA2.calc(su);
		
		System.out.println("최대수 : " + max);
	}
}