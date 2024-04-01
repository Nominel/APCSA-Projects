package MergeSort;

import java.util.Arrays;

public class mergeSort_MoraghebiShayan_040124_pd1 {
	public static void main (String[] args){
		int[] a = { 3, 10, 12, 7, 8, 5, 1, 4};
		mergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		int[] b = {8,7,6,5,8,2,1,4,9};
		mergeSort(b, 0, b.length-1);
		System.out.println(Arrays.toString(b));
	}
	public static void mergeSort(int[] arr, int lo, int hi){
		if(lo<hi){
			int mid = (hi+lo)/2;
			mergeSort(arr,lo,mid);
			mergeSort(arr,mid+1,hi);
			merge(arr,lo,mid,hi);
		}
	}
	public static void merge(int[] arr,int lo, int mid, int hi){
		int i = lo;
		int j = mid+1;
		int k = 0;
		int[] temp = new int[arr.length];
		while(i<=mid&&j<=hi){
			if(arr[i]<=arr[j]){
				temp[k]=arr[i];
				i++;
			}
			else{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		if(i>mid){
			while(j<=hi){
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		else{
			while(i<=mid){
				temp[k]=arr[i];
				i++;
				k++;
			}
		}
		for(int st = lo; st<=hi; st++)
			arr[st]=temp[st-lo];
	}
}
