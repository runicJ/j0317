package lambda;

import java.util.List;

//람다식을 활용한 성적처리('성명,국어,영어,수학점수' 입력후 처리결과를 객체로 반환)
@FunctionalInterface
interface MyFunc12 {
	void process(Ex02VO vo);
}

public class Ex02Service {
  MyFunc12 totFunc = (vo) -> vo.setTot(vo.getKor()+vo.getEng()+vo.getMat());
	
	MyFunc12 avgFunc = (vo) -> vo.setAvg(vo.getTot()/3.0);
	
	MyFunc12 gradeFunc = (vo) -> {
    if(vo.getAvg() >=90) vo.setGrade('A');
    else if(vo.getAvg() >=80) vo.setGrade('B');
    else if(vo.getAvg() >=70) vo.setGrade('C');
    else if(vo.getAvg() >=60) vo.setGrade('D');
    else vo.setGrade('F');
	};

	public Ex02VO calculator(Ex02VO vo) {
		totFunc.process(vo);
		avgFunc.process(vo);
		gradeFunc.process(vo);
		return vo;
	}
	
	public void titlePrint() {
	  System.out.println("\n\t\t** 성  적  표 **");
	  System.out.println("======================================================");
	  System.out.println("성명\t국어\t영어\t수학\t총점\t평균\t학점");
	  System.out.println("------------------------------------------------------");
	}

	// 출력하기
	public void printProcess(List<Ex02VO> vos) {
		titlePrint();
    for(Ex02VO v : vos) {
      System.out.print(v.getName() + "\t");            
      System.out.print(v.getKor() + "\t");            
      System.out.print(v.getEng() + "\t");            
      System.out.print(v.getMat() + "\t");            
      System.out.print(v.getTot() + "\t");            
      System.out.print(String.format("%.1f", v.getAvg()) + "\t");            
      System.out.print(v.getGrade() + "\t\n");
    }
    System.out.println("======================================================");
	}

}
