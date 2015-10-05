package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @file_name : NumberGolf.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 5.
 * @story : 최단횟수로 숫자맞추기 게임
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0, myCnt = 0, urCnt = 0, com = (int) (Math.random() * 100 + 1), player;

		while (true) {
			System.out.println("1부터 100까지 정수를 입력하세요.");
			try {
				player = scanner.nextInt();
				if (player < 1 || player > 100) {
					System.out.println("1부터 100까지 정수만 입력해야 합니다.");
					continue;
				}
				if (player > com) {
					System.out.println("정답보다 큽니다.");
				} else if (player < com) {
					System.out.println("정답보다 작습니다.");
				} else {
					System.out.println("정답입니다. " + count + "회만에 맞추셨습니다.");
					return;
				}	
			} catch (InputMismatchException e) {
				System.out.println("문자는 안됩니다.");
				return;
			}
			count++;
		}
	}
}
