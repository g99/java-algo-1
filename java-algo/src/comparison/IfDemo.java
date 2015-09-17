package comparison;

import java.util.Scanner;
/**
 * @file_name  : Pskage.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 단일if문 예제
 */
public class IfDemo {
	public static void main(String[] args) {
		/**
		 * 변수명은 num
		 * 컨디션은 10 이상이면
		 * "입력한 수는 10 이상입니다."
		 * "입력한 수는 10 미만입니다."
		 */
		/**
		 * continue, break(스위치 문에서만 사용), return(스위치 문을 제외한 나머지 구문에서 end)
		 */
		int condition, num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("기준을 입력해 주세요.");
		condition = scanner.nextInt();
		System.out.println("비교할 수를 입력해 주세요.");
		num = scanner.nextInt();
		if(num>condition){
			System.out.println("입력한"+num+"는 "+condition+" 초과입니다.");}
		else if(num==condition){
			System.out.println("입력한"+num+"는 "+condition+" 과 같습니다.");}
		else{System.out.println("입력한"+num+"는 "+condition+" 미만입니다.");}
	}
}
