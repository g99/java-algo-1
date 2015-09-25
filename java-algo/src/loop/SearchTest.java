package loop;
/**
 * @file_name : SearchTest.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 25.
 * @story     : 특정 글자의 갯수 구하기
 */
public class SearchTest {
	public static void main(String[] args) {
		String dest = "peter piper picked a peck of pickled pepers";
		int pCount = 0;
		for (int i = 0; i < dest.length(); i++) {
			if(dest.charAt(i)=='p'){
				pCount++;
			}
		}
		System.out.println("제시된 문자열에서 p는 " + pCount + "개 존재합니다.");
	}
}
