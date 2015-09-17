package comparison;

import java.util.Scanner;

/**
 * @file_name  : SwitchDemo.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 스위치 문법
 */
public class SwitchDemo2 {
	public static void main(String[] args) {
		int month;
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇일인지 궁금한 달을 입력하세요.");
		month = scanner.nextInt();
		String res = null; //지역변수는 반드시 초기화를 해 주어야 한다.
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			res = "31";
			break;
		case 4:case 6:case 9:case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;
		default:
			System.out.println(month+"월은 없습니다. 다시 입력하세요");
			return;
		}
		System.out.println(month + "월은 " + res + "일 까지 입니다.");
	}
}