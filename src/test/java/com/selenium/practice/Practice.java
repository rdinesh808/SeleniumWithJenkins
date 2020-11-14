package com.selenium.practice;

public class Practice {
	public int searchInsert(int[] nums, int target) {
	    int i=0; 
	    int j=nums.length-1;
	 
	    while(i<=j){
	        int mid = (i+j)/2;
	        System.out.println("mid : " + mid);
	        if(target > nums[mid]){
	            i=mid+1;
	        }else if(target < nums[mid]){
	            j=mid-1;
	        }else{
	            return mid;
	        }
	    }
	    return i;
	}
	public static void main(String[] args) {
		int[] n = {1,3,5,6};
		int target = 4;
		System.out.println(new Practice().searchInsert(n, target));
	}
}
