package loop;

/**
 * @file_name : ForLoopTen.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 21.
 * @story : 1부터 10까지 정수의 나열 => 수열(sequence of numbers)
 */
public class ForLoopTen {
	/**
	 * for loop의 strength
	 * 초기화, 한계값(limit)설정, 증감값 설정을
	 * 한 컨디션 내부에서 일괄 설정하므로
	 * 가독성이 좋고, 코딩이 빠르게 진행된다.
	 * 따라서, while loop 보다 권장한다.
	 * To. U
	 * 1부터 10까지 수열 출력하는 프로그램을 개발해 주세요.
	 */ 
	public static void main(String[] args) {
		//for(초기화(initialize) ; 한게값(limit) ; 증감값)
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println(); // 한줄 개행
		for (int i = 0; i < 10; i++) {
			System.out.print(++i+"\t");
		}
	}
}
