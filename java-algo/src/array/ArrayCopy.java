package array;

/**
 * @file_name : ArrayCopy.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 25.
 * @story : 배열복사
 */
public class ArrayCopy {
	public static void main(String[] args) {
		System.out.println("int 형 배열 복사");
		int[] dest3 = { 1, 2, 3, 4, 5 };
		int[] target3 = new int[3];
		System.arraycopy(dest3, 0, target3, 0, 2);
		for (int i = 0; i < target3.length; i++) {
			System.out.print((i + 1) + "\t");
		}
		System.out.println();
		
		//--------------------------------------------------------------
		
		System.out.println("char 형 배열 복사");
		char[] dest = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		char[] target = new char[6];
		System.arraycopy(dest, 0, target, 0, 6);
		System.out.println(new String(target));
		
		//--------------------------------------------------------------
		
		System.out.println("String 형 배열 복사");
		String[] dest2 = { "ab", "cd", "bc" };
		String[] target2 = new String[2];
		System.arraycopy(dest2, 1, target2, 0, 2);
		for (int i = 0; i < target2.length; i++) {
			System.out.println(target2[i] + "\t");
		}
	}
}
