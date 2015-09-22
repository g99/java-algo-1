package array;

import java.util.Scanner;

/**
 * @file_name : ArrayTest.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 21.
 * @story : Array 응용문제 - Money 금액을 화폐단위별로 분류
 */

public class ArrayTest2 {
	/**
	 * 예를 들어서 134,530원 이면 돈을 화폐 단위로 표시해주면 됨. ex) 5만원 2, 1만원 3, 천원 4 ... (10원 미만은
	 * 절삭)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int mok = 0; //배열도 없어도 사용가능 

		for (int i = 0; i < moneyUnit.length; i++) {
			mok = money / moneyUnit[i];
			money %= moneyUnit[i];
			System.out.print(moneyUnit[i] + "원 : " + mok + "개");
		}
	}
}
