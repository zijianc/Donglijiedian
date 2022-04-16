package ArrayList;

import java.util.Arrays;

//二分查找

public class BinaryTest {
	public static void main(String[] args) {
		int[] a = { 8,88,888,8888,88888 };
	/*	Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}*/
		int index =Arrays.binarySearch(a, 8888);
		//int index = binerySearch(a, 8888);
		System.out.println(index == -1 ? "该元素不存在" : "该元素的下标为" + index);

	}

	public static int binerySearch(int[] a, int num) {
		int begin = 0;
		int end = a.length - 1;
		while (begin <= end) {
			int mid = (begin + end) / 2;
			if (a[mid] == num){
				return mid;
			}
			else if (a[mid] < num) {
				begin = mid + 1;
			} else if (a[mid] > num) {
				end = mid - 1;
			}
		}
		return -1;
	}
}
