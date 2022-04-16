package ArrayList;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] a = { 9,8,10,7,6,0,11};
		//selectSort(a);
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void selectSort(int[] a) {
		int count =0;
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					/*int temp =a[min];
					a[min]=a[j];
					a[j]=temp;
					count++;*/
					min=j;
				}
			}
			// min不等于i，说明有更小的值，
			if (min != i) {
				int temp;
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				count++;
			}

		}
		System.out.println(count);
	}

}
