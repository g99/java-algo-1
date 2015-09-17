package comparison;

import java.util.Scanner;

/**
 * @file_name  : IfTest2.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 1등 구하기 프로그램
 */
public class IfTest2 {
	public static void main(String[] args) {
		/**
		 * To. U
		 * 프로그램을 하나 개발해야 합니다.
		 * 교수는 학생 평균을 입력하면 등수를 알려주는 기능을 추가해 달랍니다.
		 * 오더는 다음과 같이 화면에 출력하라고 합니다.
		 * 학생 이름 : 홍길동 (2)
		 * 학생 이름 : 김유신 (1)
		 * 학생 이름 : 강감찬 (3)
		 * 단) 학생은 총 3명입니다.		 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 3명의 이름과 평균을 입력해주세요.");
		String st1, st2, st3, first=null;
		int sc1, sc2, sc3;
		System.out.print("학생 1의 이름 : ");
		st1 = scanner.next();
		System.out.print("학생 1의 성적 : ");
		sc1 = scanner.nextInt();
		System.out.print("학생 2의 이름 : ");
		st2 = scanner.next();
		System.out.print("학생 2의 성적 : ");
		sc2 = scanner.nextInt();
		System.out.print("학생 3의 이름 : ");
		st3 = scanner.next();
		System.out.print("학생 3의 성적 : ");
		sc3 = scanner.nextInt();
		
		if(sc1 > 100 && sc1 < 0 && sc2 > 100 && sc2 < 0 && sc3 > 100 && sc3 < 0){
			System.out.println("다시 입력하세요.");
		}
		else if(sc1 > sc2 && sc1 > sc3)
		{
			first = st1;
		}
		else if(sc2 > sc3)
		{
			first = st2;
		}
		else{
			first = st3;
		}
		System.out.println("1등 : " + first);
	}
}
