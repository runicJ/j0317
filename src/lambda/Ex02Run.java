package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    List<Ex02VO> vos = new ArrayList<>();
    Ex02Service service = new Ex02Service();
    Ex02VO vo = null;
    
    String[] title = {"성명","국어","영어","수학"};
    int[] jumsu = new int[3];
    
    // 자료 입력하기
    while(true) {
      System.out.print(title[0] + " 을 입력하세요.(종료시 999) => ");
      String name = scanner.next();
      if(name.equals("999")) break;
      
      for(int i=0; i<jumsu.length; i++) {
        System.out.print(title[i+1] + "점수를 입력하세요.");
        jumsu[i] = scanner.nextInt();
      }
      
      vo = new Ex02VO();
      vo.setName(name);
      vo.setKor(jumsu[0]);
      vo.setEng(jumsu[1]);
      vo.setMat(jumsu[2]);
      
      vo = service.calculator(vo);
      
      vos.add(vo);
    }
    
    service.printProcess(vos);
    
    System.out.println("\t\t총 : "+vos.size()+"건...  수고하셨습니다.");
    
		scanner.close();
	}
}
