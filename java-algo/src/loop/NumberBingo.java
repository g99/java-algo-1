package loop;

import javax.swing.JOptionPane;

/**
 * @file_name : NumberBingo.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 5.
 * @story : 숫자 맞추기 게임
 */
public class NumberBingo {
	/**
	 * 1부터 20까지 랜덤 숫자를 컴퓨터 생성하면 3회 안에 숫자를 맞추는데 플레이어가 입력한 숫자가 답보다 큰지 작은지를 알려줌
	 */
	public static void main(String[] args) {
		int com = (int) (Math.random() * 10 + 1), num;
		System.out.println("숫 자 맞 추 기 게 임");
		try {
			for (int i = 0; i < 3; i++) {
				num = Integer.parseInt(JOptionPane.showInputDialog("입력하세요"));
				System.out.println(num > com ? "정답보다 큽니다." : num < com ? "정답보다 작습니다." : "정답입니다.");
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요.");
		}
		System.out.println("다 끝 났 습 니 다.");
	}
}
