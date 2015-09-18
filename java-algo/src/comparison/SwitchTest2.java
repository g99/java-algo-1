package comparison;

import java.util.Scanner;

/**
 * @file_name  : SwitchTest2.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 18.
 * @story      : Switch Test2
 */
public class SwitchTest2 {
	public static void main(String[] args) {
		/**
		 * To. U
		 * 프로그램을 하나 개발해야 합니다.
		 * 오더는 다음과 같이 화면에 출력하라고 합니다.
		 * 학생		국어		영어		수학		총점		평균		합격여부
		 * =============================================================================
		 * 홍길동	90			90			90			270			90			(장학생)
		 * 합격여부는 다음과 같다고 합니다.
		 * 평균이 90점 이상이면 장학생
		 * 70점 이상 90점 미만이면 합격
		 * 70점 미만이면 불합격이라고 하네요		 
		 */
		int math, korean, english, sum = 0, average =0;
		String name, str=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적처리 프로그램 입니다.");
		System.out.print("학생 이름 : ");
		name = scanner.next();
		System.out.print("국어 점수 : ");
		korean = scanner.nextInt();
		System.out.print("영어 점수 : ");
		english = scanner.nextInt();
		System.out.print("수학 점수 : ");
		math = scanner.nextInt();
		sum = korean + english + math;
		average = sum/3;
		
	/*	if (average >= 90) {
			str = "(장학생)";
		}else if (average >= 70) {
			str = "(합격)";
		}else {
			str = "(불합격)";
		}*/
		
		switch (average/10) {
		case 10: case 9:
			str = "장학생";
			break;
		case 8: case 7:
			str = "합격";
			break;
		default:
			str = "불합격";
			break;
		}
		System.out.println();
		System.out.println("학생\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t합격여부");
		System.out.println("========================================================================================================");
		System.out.println(name+"\t\t"+korean+"\t\t"+english+"\t\t"+math+"\t\t"+sum+"\t\t"+average+"\t\t"+str);
	}
}
