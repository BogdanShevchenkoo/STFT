package Algorithms;

public class MySearch {
	public static int binarySearch(int x[],int searchNumber){	 
		int a = x.length/2;
		int b = x.length;
		for(int i=0;;i++){	
			System.out.println("Iteration number " + (i+1));
			if( x[a]==searchNumber){
				System.out.println("Your number is " + x[a]);
				break;
			}else if( x[a] > searchNumber){
				a /= 2;
			}else if( x[a] < searchNumber){
				a = (a + b)/2;
			}else{
				System.out.println("Error");
				break;
			}
		}
		return x[a];
	}
	
	public static int binaryRecursion(int x[],int searchNumber){
		int a = x.length/2;
		int b = x.length;
		
	}
}
