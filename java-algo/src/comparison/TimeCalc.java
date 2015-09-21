package comparison;

import java.util.Scanner;

/**
 * @file_name : TimeCalc.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 21.
 * @story : 입력된 시간(초)를 시간, 분, 초로 환산하기
 */
public class TimeCalc {
	/**
	 * To. U
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 게속 계산해야 해서요.
	 * 혹시 초값을 입력 받으면 자동으로 계산되는 프로그램을 만들어
	 * 줄 수 있을까요?
	 * 그러니까 500초 이면 몇시간 몇분 몇초라고 보여주면 좋겠죠. 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int ONE_MINUTE = 60,ONE_HOUR = ONE_MINUTE*60 ;
		int sec, hour=0, min=0;
		System.out.print("초를 입력하세요 : ");
		sec = scanner.nextInt();
		if (sec >= ONE_HOUR) {	
			hour = sec / ONE_HOUR;
			sec = sec % ONE_HOUR;
			min = sec / ONE_MINUTE;
			sec = sec % ONE_MINUTE;
		}else if (sec >= ONE_MINUTE) {
			min = sec / ONE_MINUTE;
			sec = sec % ONE_MINUTE;
		}
//		
//		hour = sec / ONE_HOUR;
//		sec = sec % ONE_HOUR;
//		min = sec / ONE_MINUTE;
//		sec = sec % ONE_MINUTE;
//		
		System.out.println(hour + "시간 " + min + "분 " + sec + "초"	);
	}
}
