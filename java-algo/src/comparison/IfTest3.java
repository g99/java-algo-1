package comparison;

import java.util.Scanner;

/**
 * @file_name  : IfTest3.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 18.
 * @story      : If-else로 SSN 성별 분석하기
 */
public class IfTest3 {
	public static void main(String[] args) {
		/**
		 * To. U
		 * 프로그램을 하나 개발해야 합니다.
		 * 교수가 주민번호를 입력하면 해당 학생이 남자인지, 여자인지, 외국인인지 
		 * 자동으로 출력해 주는 프로그램을 만들어 달랍니다.
		 * 홍길동 : 800101-1234567 : 남
		 * 입력값은 이름과 주민번호이고 성별은 자동으로 출력되는 값입니다.
		 * 현행법상 1,3으로 시작되면 남자, 2,4로 시작되면 여자, 5,6이면 외국인
		 * 교수가 실수로 다른 숫자로 시작할 경우 
		 * "다시 입력하세요" 라고 알려주시기 바랍니다.
		 * String ssn = scanner.next();
		 * char ch = ssn.charAt();
		 */
		String name, ssn, gender = null;
		char ch = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호로 성별을 구분하는 프로그램입니다.");
		System.out.print("학생 이름 : ");
		name = scanner.next();
		System.out.print("주민 번호 : ");
		ssn = scanner.next();
		ch = ssn.charAt(7);
		if (ch == '1' || ch == '3') {
			gender = "남자";
		}else if (ch == '2' || ch == '4') {
			gender = "여자";
		}else if (ch == '5' || ch == '6') {
			gender = "외국인";
		}else {
			System.out.println("다시 입력하세요.");
			return;
		}
		System.out.println(name + " : " + ssn + " : " + gender);
	}
}
