package findMinIndex;

public class MinIndex_MoraghebiShayan_032124_pd1 {
	public static void main(String[] args){
		System.out.println(findMinIndex(new int[] {3, 7, 8, 1, 2}));
		System.out.println(findMinIndex(new int[] {3}));
		System.out.println(findMinIndex(new String[] {"Rhinos", "CVHS", "LOL", "computer", "research", "advance", "sciences"}));
		System.out.println(findMinIndex(new String[] {"Lagrange", "PD", "epicycloid", "Fourier"}));
		System.out.println(findMinIndex(new String[] {"Squaliformes", "Elasmobranchii", "Holocephali", "Rajiformes", "Lamniformes"}));
	}
	public static int findMinIndex(int[] arr){
		return findMinIndex(arr,0);
	}
	public static int findMinIndex(int[] arr, int start){
		if(start==arr.length)
			return arr.length-1;
		int val = findMinIndex(arr,start+1);
		if(arr[val]<arr[start])
			return val;
		else
			return start;
	}
	public static int findMinIndex(String[] arr){
		return findMinIndex(arr,0);
	}
	public static int findMinIndex(String[] arr, int start){
		if(start==arr.length)
			return arr.length-1;
		int val = findMinIndex(arr,start+1);
		if(arr[val].compareToIgnoreCase(arr[start])<0)
			return val;
		else
			return start;
	}
}
