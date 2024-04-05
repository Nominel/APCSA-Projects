package QuickSort;

import java.util.Arrays;

public class QSort_MoraghebiShayan_040524_pd1 {
	public static void main (String[] args){
		int[] x = {12,7,8,15,20,10,9,13,19,25, 5, 4};
		quickSort(x, 0, x.length-1);
		System.out.println(Arrays.toString(x));
	}
	public static void quickSort(int[] arr, int lo, int hi){
		if(hi>lo) {
			int spot = divide(arr, lo, hi);
			quickSort(arr, lo, spot);
			quickSort(arr, spot + 1, hi);
		}
	}
	public static int divide(int[] arr, int lo, int hi){
		int pivot = arr[lo];
		int spot = lo;
		int left = lo;
		int right = hi;
		while(left<=right) {
			while (arr[left] <= pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (right > left) {
				swap(arr, right, left);
			} else {
				swap(arr, lo, right);
				spot = right;
			}
		}
		return spot;
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
