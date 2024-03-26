package SelectionSort;

import java.util.Arrays;

public class RecursiveSelectionSort_MoraghebiShayan_032624_pd1 {
	public static void main(String[] args){
		int[] a = {3,8,7,1,2};
		selectionSort(a);
		System.out.println(Arrays.toString(a));

		a=new int[] {3};
		selectionSort(a);
		System.out.println(Arrays.toString(a));

		String[] b = {"axy", "rxt", "xyz", "zab", "abc"};
		selectionSort(b);
		System.out.println(Arrays.toString(b));

		b=new String[] {"Lagrange", "PD", "epicycloid", "Fourier"};
		selectionSort(b);
		System.out.println(Arrays.toString(b));

		b=new String[] {"Squaliformes", "Elasmobranchii", "Holocephali", "Rajiformes", "Lamniformes"};
		selectionSort(b);
		System.out.println(Arrays.toString(b));
	}
	public static void selectionSort(int[] arr){
		selectionSort(arr,0);
	}
	public static void selectionSort(int[] arr,int i){
		if(i<arr.length-1){
			int min_idx = i;
			for (int j = i+1; j < arr.length; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element of the unsorted array
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			selectionSort(arr,i+1);
		}
	}

	public static void selectionSort(String[] arr){
		selectionSort(arr,0);
	}
	public static void selectionSort(String[] arr, int i){
		if(i<arr.length-1){
			int min_idx = i;
			for (int j = i+1; j < arr.length; j++)
				if (arr[j].compareToIgnoreCase(arr[min_idx]) < 0)
					min_idx = j;

			// Swap the found minimum element with the first
			// element of the unsorted array
			String temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			selectionSort(arr,i+1);
		}
	}
}
