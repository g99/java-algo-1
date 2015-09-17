package operator;
/**
 * @file_name  : Pskage.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 단항연산자 문법(후위)
 */
public class UnaryDemo2 {
	public static void main(String[] args) {
		/**
		 * i++ (후위 연산자)는 먼저 i값을 호출한 후 연산한다.
		 */
		
		int i=10,j=10;
		System.out.println("i++ 의 값 : "+(i++));
		System.out.println("j-- 의 값 : "+(j--));
		System.out.println("호출한 후 연산적용 결과");
		System.out.println("i++ 의 값 : "+(i++));
		System.out.println("j-- 의 값 : "+(j--));
	
	}
}
