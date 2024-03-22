package LinearSearch;

public class RecursiveLS_MoraghebiShayan_032224_pd1 {
	public static void main(String[] args){
		int[] a = { 12, 10, -1, 19, 10, 7, -12, 45};
		int[] b = {-1, -2, -3, 4, 5, 7, -1, -2, -3, 4, 5};
		System.out.println(linearSearch(a,6));
		System.out.println(linearSearch(a,12));
		System.out.println(linearSearch(a,45));
		System.out.println(linearSearch(b,3));
		System.out.println(linearSearch(b,4));
		System.out.println(linearSearch(b,5));
	}
	public static int linearSearch(int[] arr, int target){
		return linearSearch(arr, target, 0);
	}
	public static int linearSearch(int[] arr, int target, int i){
		if(i<arr.length){
			if(arr[i]==target)
				return i;
			else
				return linearSearch(arr, target, i+1);
		}
		return -1;
	}
}
