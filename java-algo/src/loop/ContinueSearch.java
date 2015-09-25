package loop;

import java.util.Scanner;

/**
 * @file_name : ContinueSearch.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 25.
 * @story : continue를 이용한 간단한 검색엔진 원리 이해
 */
public class ContinueSearch {
	/**
	 * 검색어 [동해]가 존재하는지 여부 체크
	 */
	public static void main(String[] args) {
		String dest = "동해물백두산";
		boolean isExist = false;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			isExist= false;	
			System.out.println("검색어를 입력하세요 (q일때 종료)");
			String search = scanner.next();
			if(search.equals("q")){
				return;
			}
			int max = dest.length() - search.length(); //검색방식이 첫글자를 먼저 맞추는 형태이므로 또, 예외처리도 가능
			test:
				for (int i = 0; i <= max; i++) {
				int n = search.length(); //검색어의 길이
				int destStartPoint = i; //다음 검색시작위치
				int searchStartPoint = 0;
				while (n-- != 0) { //검색어 길이를 만족하면서
					if (dest.charAt(destStartPoint++) != search.charAt(searchStartPoint++)) { //첫글자가 일치하면서 다음글자까지 일치하면 됨 
						continue test;
					}
				}
				isExist = true;
				break test;
			}
			System.out.println(isExist ? "검색어[" + search + "] 존재 " : "존재하지 않음");
		}
	}
}

/**
 * 27 :test를 라벨로 사용함
 * 40 : 삼항연산자 (조건문) ? true : false // if else를 대체함
 */