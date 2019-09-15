public class SelectionSort implements SortingAlgorithm {
	public void sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			swap(a, i, findMin(a, i));
		}
	}

	public void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public int findMin(int[] a, int x) {
		int min = x;
		for(int i = x + 1; i < a.length; i++) {
			if(a[i] < a[min]) {
				min = i;
			}
		}
		return min;
	}
}