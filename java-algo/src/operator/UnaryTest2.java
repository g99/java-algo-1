package operator;
/**
 * @file_name  : Pskage.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : [cookbook - java5.0] p.91-2 단항연산자 예제
 */
public class UnaryTest2 {
	public static void main(String[] args) {

		int a = 10, b = 20;
				
		System.out.println("++a의 값은 = "+ ++a);
		System.out.println("++a + b++의 값은 = "+ ++a + b++);
		System.out.println("(++a%3) + (a*++b)의 값은 = "+ (++a%3) + (a*++b));
		
	}
}
