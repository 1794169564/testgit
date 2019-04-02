package com.z.controller;

public class TestDo {

	public static void main(String[] args) {
		int[] nums = {9,8,6,2,3,4,7,5,1,0,10,59,66,44,789,55,0,4,5,6,1,5,48,485,4848,414541,12121,000,41545,444,4};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]>nums[j]) {
					int a = nums[i];
					nums[i] = nums[j];
					nums[j] = a;
				}
			}
		}
		for(int n : nums){
			System.out.println(n);
		}
		
	}
	
}
