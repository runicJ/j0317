package lambda;

@FunctionalInterface
interface MyfuncA1 {
	String calc(int su);
}

public class Exam1 {
	public static void main(String[] args) {
		
//		MyfuncA1 mdMyfuncA1 = new MyfuncA1() {
//			@Override
//			public String calc(int su) {
//				String res = "";
//				if(su > 0) res = "양수";
//				else if(su == 0) res = "0";
//				else res = "음수";
//				return res;
//			}
//		};
		
		MyfuncA1 mdMyfuncA1 = (su) -> {
			String res = "";
			if(su > 0) res = "양수";
			else if(su == 0) res = "제로";
			else res = "음수";
			return res;
		};
		
		String temp = mdMyfuncA1.calc(0);
		System.out.println("입력된 수 : " + temp);
	}
}
