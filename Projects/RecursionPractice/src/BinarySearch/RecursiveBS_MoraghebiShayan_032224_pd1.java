package BinarySearch;

public class RecursiveBS_MoraghebiShayan_032224_pd1 {
	public static void main(String[] args){
		int[] a = {-5, -3, 0, 1, 7, 8, 10,15};
		System.out.println(binarySearch(a, 10));
		System.out.println(binarySearch(a, -5));
		System.out.println(binarySearch(a, 7));
		System.out.println(binarySearch(a, -7));
		int[] b = {-50,-40,-30,-20,-10,0,10,20,30,40,50};
		System.out.println(binarySearch(b,-40));
		System.out.println(binarySearch(b,1));
		System.out.println(binarySearch(b,20));
	}
	public static int binarySearch(int[] arr, int target){
		if(target>arr[arr.length-1]||target<arr[0])
			return -1;
		return binarySearch(arr,target,arr.length,0);
	}
	public static int binarySearch(int[] arr, int target, int hi, int lo){
		if(lo<=hi){
			int mid = lo + (hi - lo)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				return binarySearch(arr,target,hi,mid+1);
			else
				return binarySearch(arr,target,mid-1,lo);
		}
		return -1;
	}
}
