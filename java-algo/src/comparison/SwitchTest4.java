package comparison;

/**
 * @file_name  : SwitchTest4.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 18.
 * @story      : 그냥 split써서 해보기 음수는 못계산해줌 
 */
import java.util.Scanner;

public class SwitchTest4 {
	public static void main(String[] args) {
		int operand1 = 0, operand2 = 0;
		String calc, operator = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("식을 입력하시오.");
		calc = scanner.nextLine();
		String[] values;  
		
		if(calc.length() == 3){
			values = calc.split("[+-/*]");
			operand1 = Integer.parseInt(values[0]);
			operand2 = Integer.parseInt(values[1]);
			operator = calc.substring(1,2);
		}
		else if (calc.length() == 5) {
			values = calc.split(" ");
			operand1 = Integer.parseInt(values[0]);
			operator = values[1];
			operand2 = Integer.parseInt(values[2]);			
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		switch (operator) {
		case "+":
			System.out.println(operand1 + " + " + operand2 + " = " + (operand1+operand2));
			break;
		case "-":
			System.out.println(operand1 + " - " + operand2 + " = " + (operand1-operand2));
			break;
		case "*":
			System.out.println(operand1 + " * " + operand2 + " = " + (operand1*operand2));
			break;
		case "/":
			System.out.println(operand1 + " / " + operand2 + " = " + (operand1/operand2) + " [" + (operand1%operand2) + "]");
			break;
		default:
			System.out.println("잘못입력함 다시");
			break;
		}
	}
}