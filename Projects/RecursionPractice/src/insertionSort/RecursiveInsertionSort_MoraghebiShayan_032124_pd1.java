package insertionSort;

import java.util.Arrays;

public class RecursiveInsertionSort_MoraghebiShayan_032124_pd1 {
	public static void main(String[] args){
		int[] arr = {3,7,8,1,2};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		arr= new int[]{3};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		String[] arrr = {"Rhinos", "CVHS", "LOL", "computer", "research", "advance", "sciences"};
		insertionSort(arrr);
		System.out.println(Arrays.toString(arrr));
		arrr=new String[]{"Lagrange", "PD", "epicycloid", "Fourier"};
		insertionSort(arrr);
		System.out.println(Arrays.toString(arrr));
		arrr=new String[]{"Squaliformes", "Elasmobranchii", "Holocephali", "Rajiformes", "Lamniformes"};
		insertionSort(arrr);
		System.out.println(Arrays.toString(arrr));
	}
	public static void insertionSort(int[] arr){
		if(arr.length>1)
			insertionSort(arr,1,0);
	}
	public static void insertionSort(int[] arr, int i, int j){
		int key = arr[i];
		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = key;
		if(i<arr.length-1)
			insertionSort(arr,i+1,i);
	}
	public static void insertionSort(String[] arr){
		if(arr.length>1)
			insertionSort(arr,1,0);
	}
	public static void insertionSort(String[] arr, int i, int j){
		String key = arr[i];
		while (j >= 0 && arr[j].compareToIgnoreCase(key)>0) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = key;
		if(i<arr.length-1)
			insertionSort(arr,i+1,i);
	}
}
