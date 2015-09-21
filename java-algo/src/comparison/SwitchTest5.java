package comparison;

import java.util.Scanner;
/**
 * @file_name  : SwitchTest5.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 월요일 손풀기
 */
public class SwitchTest5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int op1, op2;
		String operator;
		System.out.print("피연산자1 : ");
		op1 = scanner.nextInt();
		System.out.print("연산자 : ");
		operator = scanner.next();
		System.out.print("피연산자2 : ");
		op2 = scanner.nextInt();
		switch (operator) {
		case "+":
			System.out.println(op1 + operator + op2 + " = " + (op1 + op2));
			break;
		case "-":
			System.out.println(op1 + operator + op2 + " = " + (op1 - op2));
			break;
		case "*":
			System.out.println(op1 + operator + op2 + " = " + (op1 * op2));
			break;
		case "/":
			System.out.println(op1 + operator + op2 + " = " + (op1 / op2) + " [" + (op1 % op2) + "]");
			break;

		default:
			break;
		}
	}
}
