package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchTest3.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 18.
 * @story : 스태틱으로 만든 사칙연산 계산기
 */
public class StaticCalcMain {
	public static void main(String[] args) {
		int num1, num2;
		String operator;
		Scanner scanner = new Scanner(System.in);
		System.out.println("==== 계산기 ====");
		System.out.print("숫자 두개를 입력하세요 : ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
//		StaticCalc calc = new StaticCalc(); 스태틱을 인스턴스방식으로 접근해서 경고메시지가 발생함
//		calc.plus(num1, num2);
		System.out.println("덧셈 결과 : " + StaticCalc.plus(num1, num2));
		System.out.println("뺄셈 결과 : " + StaticCalc.minus(num1, num2));
		System.out.println("곱셈 결과 : " + StaticCalc.multiply(num1, num2));
		System.out.println("나눗셈 결과 : " + StaticCalc.divide(num1, num2));
	}
}

class StaticCalc {
	static int result = 0; // 멤버변수 중에서 클래스변수(=static)

	public static int plus(int a, int b) { // 파라미터는 초기화할 필요가 없다.
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return (b != 0) ? a / b : a;
	}
}
