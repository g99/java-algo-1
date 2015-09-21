package array;
/**
 * @file_name  : ArrayEx1.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 배열연습
 */
public class ArrayEx1 {
	public static void main(String[] args) {
//		char[] arr = new char[]{'J','a','v','a'}; //이것도 가능함
//		char[] arr = {'J','a','v','a'};
		char[] arr = new char[4];
		arr[0] = 'J';
		arr[1] = 'a';
		arr[2] = 'v';
		arr[3] = 'a';
		for(int i=0; i<arr.length ; i++){
			System.out.println("arr["+i+"]의 값은" +arr[i]);
		}
	}
}
