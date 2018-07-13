package Algorithms;

public class TwoSum{
	public static int [] twoSum(int nums[],int target){
	    int a;
	    int b;
	    for(int i=1; i < nums.length; i++){
	        if(nums[i]+nums[i-1]==target){
	           a = nums[i];
	           b = nums[i-1];
	           System.out.println("a = " + a + "b = " + b );
	           return new int [] {a,b};
	        }
	    }	throw new IllegalArgumentException("No two sum solution");
		}
}