package loop;

import java.util.Scanner;

/**
 * @file_name : Gugudan.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 25.
 * @story     : 구구단
 */
public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("몇 단 해 줄 까 : ");
		num = scanner.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
}
