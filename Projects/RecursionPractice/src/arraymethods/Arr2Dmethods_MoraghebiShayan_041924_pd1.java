package arraymethods;

import java.util.Arrays;

public class Arr2Dmethods_MoraghebiShayan_041924_pd1 {
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}};
		System.out.println(Arrays.deepToString(a));
		reflectMajor(a);
		System.out.println(Arrays.deepToString(a));
		reflectMajor(a);
		System.out.println(Arrays.deepToString(a));
		reflectMinor(a);
		System.out.println(Arrays.deepToString(a));
		reflectMinor(a);
		System.out.println(Arrays.deepToString(a));
		cutToMaxValue(a,10);
		System.out.println(Arrays.deepToString(a));
		int[][] b = {{100, 101, 102, 103, 104, 105},
			{106, 107, 108, 109, 110, 111},
			{112, 113, 114, 115, 116, 120},
			{121, 122, 123, 124, 125, 126},
			{131, 132, 133, 134, 135, 136},
			{141, 142, 143, 144, 145, 146}};
		System.out.println(Arrays.deepToString(b));
		reflectMajor(b);
		System.out.println(Arrays.deepToString(b));
		reflectMajor(b);
		System.out.println(Arrays.deepToString(b));
		reflectMinor(b);
		System.out.println(Arrays.deepToString(b));
		reflectMinor(b);
		System.out.println(Arrays.deepToString(b));
		cutToMaxValue(b,130);
		System.out.println(Arrays.deepToString(b));
	}
	public static void reflectMajor(int[][] arr){
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n-1-j][n-1-i];
				arr[n-1-j][n-1-i] = temp;
			}
		}
	}
	public static void reflectMinor(int[][] arr){
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	public static void cutToMaxValue(int[][] arr, int max){
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] > max){
					arr[i][j] = max;
				}
			}
		}
	}
}
