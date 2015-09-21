package loop;

import java.util.Scanner;

/**
 * @file_name  : ForLoopTenSum.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 등차수열 1~10 의 요소의 합 구하기
 */
public class ForLoopTenSum {
	/**
	 * To. U
	 * 교수님이 1부터 원하는 숫자까지 합을 구해달라고 합니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, num;
		System.out.println("1부터 원하는 값까지 더해주는 프로그램 입니다.");
		System.out.print("원하는 값 : ");
		num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		/**
		 * sum = sum + 1
		 * sum = sum + 2
		 * .
		 * .
		 * sum = sum + 10
		 */
		System.out.println("합계는 : " + sum);
	}
}
