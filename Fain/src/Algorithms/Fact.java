package Algorithms;
//factorial
public class Fact {
	public static int fact(int n){
		if(n == 1)return 1;
		if(n == 2)return 2;
		
		return fact(n-1)*n; 
	}
}
