package String;

import java.util.Random;

public class RandonTest {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		Random r = new Random();
		int index = 0;
		while (index < arr.length) {
			int num = r.nextInt(5);
			if (!contains(arr, num)) {
				arr[index++] = num;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static boolean contains(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}

}
