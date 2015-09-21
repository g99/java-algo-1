package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopOddSum.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 21.
 * @story : 홀수합, 짝수합 따로 더하기
 */
public class ForLoopOddSum {
	/**
	 * 입력받은 두개의 수 범위 값 중에서 짝수의 합, 홀수의 합을 따로 출력하세요.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oddSum = 0, evenSum = 0, num1, num2, temp = 0;
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
			if (i % 2 == 0) { //짝수면
				evenSum += i;
			}
			else { //홀수면
				oddSum += i;
			}
		}
		System.out.println(num1 + "에서 " + num2 + "까지 짝수 합계는 : " + evenSum);
		System.out.println(num1 + "에서 " + num2 + "까지 홀수 합계는 : " + oddSum);
	}
}
