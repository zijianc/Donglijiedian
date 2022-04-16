package ArrayList;

public class MergeTest {
public static void main(String[] args) {
	long a[] = { 5, 4, 9, 8, 7, 6, 0, 1, 3, 2 };
	 mergeSort(a, 0, a.length - 1);
	 
	 for (int j = 0; j < a.length; j++) {
	 System.out.print(a[j] + " ");
	 }
}
	

	 public static void merge(long array[], int p, int q, int r) {
		 int n1 = q - p + 1;
		    int n2 = r - q;

		    long L[] = new long[n1];
		    long M[] = new long[n2];

		    // fill the left and right array
		    for (int i = 0; i < n1; i++)
		      L[i] = array[p + i];
		    for (int j = 0; j < n2; j++)
		      M[j] = array[q + 1 + j];

		    // Maintain current index of sub-arrays and main array
		    int i, j, k;
		    i = 0;
		    j = 0;
		    k = p;

		    // Until we reach either end of either L or M, pick larger among
		    // elements L and M and place them in the correct position at A[p..r]
		    // for sorting in descending
		    // use if(L[i] >= <[j])
		    while (i < n1 && j < n2) {
		      if (L[i] <= M[j]) {
		        array[k] = L[i];
		        i++;
		      } else {
		        array[k] = M[j];
		        j++;
		      }
		      k++;
		    }

		    // When we run out of elements in either L or M,
		    // pick up the remaining elements and put in A[p..r]
		    while (i < n1) {
		      array[k] = L[i];
		      i++;
		      k++;
		    }

		    while (j < n2) {
		      array[k] = M[j];
		      j++;
		      k++;
		    }
	 }
	 public static void mergeSort(long array[], int p, int r) {
	 if (p < r) {
	 int q = (p + r) / 2;
	 mergeSort(array, p, q);
	 mergeSort(array, q + 1, r);
	 merge(array, p, q, r);
	 }
	 }
}
