package array;

/**
 * @file_name  : ArrayTen.java
 * @author     : g9yong44@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : int type 배열 요소의 합
 */
public class ArrayTen {
	/**
	 * 1 부터 10까지의 합 구하기(옵션 : 배열로)  
	 */
	public static void main(String[] args) {
		int sum = 0;
//		int[] arr = {1,2,3,4,5}; //초기화를 바로할 경우 
//		int[] arr = new int[5];
//		arr[0] = 107;
//		arr[1] = 255;
//		arr[2] = 314;
//		arr[3] = 4;
//		arr[4] = 5;
		
		int[] arr = new int[10];
		
		//version 1
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = i+1;
			sum += arr[i];
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		//version 2
//		for(int i = 0 ; i < arr.length ; i++){
//			arr[i] = i+1;
//		}
//		for(int i = 0 ; i < arr.length ; i++){
//			sum += arr[i];
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
