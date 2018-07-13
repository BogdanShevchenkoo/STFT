package Algorithms;

public class MySorts {
	
	public static void bubble(int [] x){
		for(int i = 0 ; i < x.length; i++){
			for(int j = i + 1; j < x.length; j++){
				if(x[i] > x[j]){
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			} System.out.println(x[i]);
		} 
	}
	
	public static void bubble(int [] x,boolean asc){
		for(int i = 0 ; i < x.length; i++){
			for(int j = i + 1; j < x.length; j++){
				if(x[i] < x[j]){
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			} System.out.println(x[i]);
		} 
	}
	
	public static void merge(int [] x){
		int arrLen = x.length;
		if(arrLen < 2){
			return;
		}else{
			merge(x);
		}
//		if(x.length < 3){
//			return;
//		}else{
//			int boxes = x.length / 2; // how many blocks with 2 variables
//			for(int i = 0; i < boxes; i++){
//				int [] xx = x;
//			}
//		}	
	}
}
