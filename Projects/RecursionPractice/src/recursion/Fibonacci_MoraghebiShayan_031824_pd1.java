package recursion;

public class Fibonacci_MoraghebiShayan_031824_pd1 {
	public static int fibonacci(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonacci(n-2)+fibonacci(n-1);
	}

	public static void main(String[] args){
		System.out.println(fibonacci(0));
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(8));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(15));
	}
}
