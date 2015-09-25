package array;
/**
 * @file_name : ArrayMrSmith.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 25.
 * @story     : 이중배열 예제
 */
public class ArrayMrSmith {
	public static void main(String[] args) {
		String[][] names = {
				{"찰리","스미스","실족사"},
				{"알파","브라보","사망"},
				{"효도르","홍길동","메시"},
				{"슈퍼맨","베트맨","노골"},
				{"로드리게스","호날두","VS"}
				};
		//찰리사망
		System.out.println(names[0][0] + names[1][2]);
		//호날두노골
		System.out.println(names[4][1] + names[3][2]);
		//슈퍼맨VS베트맨
		System.out.println(names[3][0] + names[4][2] + names[3][1]);
	}
}
