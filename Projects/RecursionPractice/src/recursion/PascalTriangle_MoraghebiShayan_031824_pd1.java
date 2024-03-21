package recursion;

public class PascalTriangle_MoraghebiShayan_031824_pd1 {
	public static int nTHCoeff(int exp, int n){
		if(n>exp+1)
			return -1;
		else if(n==exp+1||n==1)
			return 1;
		else{
			return nTHCoeff(exp-1,n)+nTHCoeff(exp-1,n-1);
		}
	}

	public static void main(String[] args){
		System.out.println(nTHCoeff(5,3));
		System.out.println(nTHCoeff(6,5));
		System.out.println(nTHCoeff(3,3));
		System.out.println(nTHCoeff(0,3));
		System.out.println(nTHCoeff(0,1));
		System.out.println(nTHCoeff(10,9));
		System.out.println(nTHCoeff(15,13));
		System.out.println(nTHCoeff(32,29));
		System.out.println(nTHCoeff(180,149));
	}
}
