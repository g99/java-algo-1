package loop;

import java.util.Scanner;

/**
 * @file_name : NumberNear.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 5.
 * @story : 가까운수 구하기
 */
public class NumberNear {
	/**
	 * [결과] 다음 배열이 있을 때 입력한 수와 가장 가까운 수를 구하시오. 단, 동일 차이면 작은 수를 선택한다.
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		Scanner scanner = new Scanner(System.in);
		int num, gap = 100, save = 0;
		System.out.println("타겟 넘버를 입력하세요");
		num = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(num - arr[i]) < gap && num - arr[i] != 0) {
				gap = num - arr[i];
				save = i;
			}
		}
		System.out.println(arr[save] + "가 가장 가깝습니다.");
	}
}
