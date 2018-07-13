package Algorithms;

public class FibonacciNumbers {
	public static void fibonacci() {
		int previousNumber = 1;
		int currentNumber = 1,sum;
		System.out.println(previousNumber);
		System.out.println(currentNumber);
		for(int i = 0;i < 20;i++){
			sum = previousNumber+currentNumber;
			System.out.println(sum);
			previousNumber = currentNumber;
			currentNumber=sum;
			if(currentNumber == 0){
				currentNumber++;
			}
		}
	}
	public static int fibonacciRecursion(int n) {
		if(n==0)return 0;
		if((n == 1) || (n == 2)) return 1;
		
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}
}
