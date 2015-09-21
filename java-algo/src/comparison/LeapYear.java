package comparison;

import java.util.Scanner;

/**
 * @file_name : LeapYear.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 21.
 * @story : 윤년 판별 프로그램
 */
public class LeapYear {
	/**
	 * 연도를 4로 나눈 값이 0 이라면 윤년일 수 있다. 그러다 해당 연수가 100으로 나누어 떨어지면 평년이다. 하지만, 400으로
	 * 나눠 떨어질 경우 윤년이다. 그러므로 2000년은 윤년이다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, dis = 0;
		System.out.println("윤년 판별 프로그램");
		System.out.print("연도 : ");
		year = scanner.nextInt();
		/**
		 * 필터링 : if문에서 차례대로 연산식을 거쳐 참 거짓을 판별하면서 하부로
		 * 값을 전달하는 행위.
		 * 필터링 방식을 결과값을 크게 주는 범위부터 작은 방향으로 진행함.
		 * 
		 */
		
		if (year % 400 == 0) {
			dis = 1; // 400으로 나뉘면 윤년
		} else if (year % 100 == 0) {
			dis = 0; // 400으로는 안나뉘고100으로 나뉘면 평년
		} else if (year % 4 == 0) {
			dis = 1; // 4로 나뉘면 윤년
		} else {
			dis = 0; // 4로 안나뉘면 평년
		}

		if (dis == 1) {
			System.out.println(year + "는 윤년입니다.");
		} else {
			System.out.println(year + "는 평년입니다.");
		} 
	}
}
