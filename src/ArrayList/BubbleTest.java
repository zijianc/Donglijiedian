package ArrayList;

public class BubbleTest {
	public static void main(String[] args) {
		/*int[] a = new int[] { 44, 82, 24, 34, 1 };
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}*/
		
		BubbleTest bb =new BubbleTest();
		long[] b = new long[] { 5, 1, 3, 3, 2, 6, 0, 5, 4, 0 };
		bb.mergeSort(b, 0, b.length-1);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

	public static void sort(int[] arr) {
		int count = 0;
		int temp = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(count);

	}
	private void mergeSort(long[] a, int p, int r) {
		if(p<r){
			int q =(p+r)/2;
			mergeSort(a,p,q);
			mergeSort(a,q+1,r);
			merge(a,p,q,r);
		}
	}
	private  void merge(long[] a, int p, int q, int r) {
		int i,j,k,n1,n2;
		n1=q-p+1;
		n2=r-q;
		long[] L=new long[n1];
		long []R=new long[n2];
		for (i = 0,k=p; i < n1; i++,k++) 
			L[i]=a[k];
		for(i=0,k=q+1;i<n2;i++,k++)
			R[i]=a[k];
		for(k=p,i=0,j=0;i<n1&&j<n2;k++){
			if(L[i]>R[j]){
				a[k]=L[i];
				i++;
			}else{
				a[k]=R[j];
				j++;
			}
		}
		if(j<n1){
			for(j=i;j<n1;j++,k++)
				a[k]=L[j];
		}
		if(j<n2){
			for(i=j;i<n2;i++,k++){
				a[k]=R[i];
			}
		}
		
	}
}
