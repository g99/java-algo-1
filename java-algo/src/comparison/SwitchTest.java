package comparison;

import java.util.Scanner;

/**
 * @file_name  : SwitchTest.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 18.
 * @story      : 스위치 테스트
 */
public class SwitchTest {
	public static void main(String[] args) {
		/**
		 * notation(표기법)
		 * 정수 타입 : 1, 2, 3
		 * 실수 타입 : 1.0, 2.0
		 * 문자 타입 : 'ㅁ'
		 * 문자열 타입 : "김이박"
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
		switch(ch)
		{
		case '1':
		case '3':
			gender = "남";
			break;
		case '2':
		case '4':
			gender = "여";
		case '5':
		case '6':
			gender = "외국인";
		default:
			System.out.println("다시 입력하세요.");
			return;
		}
		System.out.printf(name + " : " + ssn + " : " + gender);
	}
}