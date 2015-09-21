package loop;

import java.util.Scanner;

/**
 * @file_name  : ForLoopTenSum.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 등차수열 입력한 값과 값 사이의 요소의 합 구하기
 */
public class ForLoopSum {
	/**
	 * To. U
	 * 교수님이 원하는 수부터 수까지 합을 구해달라고 합니다.
	 * 그런데, 교수님이 까다로워서 큰 수를 먼저 입력하든
	 * 나중에 입력하든 두 수 사이의 정수들의 합을 나오게 해달라고 합니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, num1, num2, temp = 0;
		System.out.println("원하는 값부터 원하는 값까지 더해주는 프로그램 입니다.");
		System.out.print("원하는 값1 : ");
		num1 = scanner.nextInt();
		System.out.print("원하는 값2 : ");
		num2 = scanner.nextInt();
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for (int i = num1; i <= num2; i++) {
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
