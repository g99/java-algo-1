package comparison;

import java.util.Scanner;

/**
 * @file_name  : SwitchTest3.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 18.
 * @story      : 사칙연산 계산기 만들기
 */
public class SwitchTest3 {
	/**
	 * To. U
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수가 말하길 브라우저에서 사용할 계산기를 만들어 달랍니다.
	 * 복잡할 필요는 없고, 사칙연산이 가능하고 나눗셈은
	 * 몫과 나머지 값으로 출력하면 된답니다.
	 * 
	 * 출력결과물은 예를 들어
	 * 5 + 5 = 10
	 * 이렇게 되고 ,
	 * 10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
	 * 그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
	 */
	public static void main(String[] args) {
		int num1, num2, result;
		String operator;
		Scanner scanner = new Scanner(System.in);
		System.out.println("==== 계산기 ====");
		System.out.print("첫 번째 숫자 : ");
		num1 = scanner.nextInt();
		System.out.print("연산자 : ");
		operator = scanner.next();
		System.out.print("두 번째 숫자 : ");
		num2 = scanner.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2) + " [" + (num1%num2) + "]");
			break;
		default:
			System.out.println("잘못입력함 다시");
			break;
		}
		
	}
}
