package loop;
/**
 * @file_name : RealGugudan.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 25.
 * @story     : 구구단 책받침
 */
public class RealGugudan {
	public static void main(String[] args) {
		for(int k = 2; k < 7; k+=4){
			for (int i = 1; i < 10; i++) {
				for (int j = k; j < k+4; j++) {
					System.out.print(j + " * " + i + " = " + i*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
