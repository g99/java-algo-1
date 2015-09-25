package loop;

/**
 * @file_name : Continue3Multiple.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 25.
 * @story : 3의 배수를 제외한 출력
 */
public class Continue3Multiple {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				continue; //조건에 맞으면 아래로 진행하지 말고 다시 처음에서 시작
			}
			System.out.print(i + "\t");
		}
	}
}
