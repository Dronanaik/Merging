package arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int[] nums=new int[5];
		int[] nums1= {100,200,300,400,500};
		nums[0]=100;
		nums[1]=100;
		nums[2]=100;
		nums[3]=100;
		nums[0]=100;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Values");		
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=scn.nextInt();
		}
//		for(int i=0;i<nums.length;i++)
//		{
//			System.out.println(nums[i]);
//		}
		for(int temp:nums)
		{
			System.out.println(temp);
		}
		
		
		String[] names= new String[4];
		System.out.println("Enter Names");		
		for(int i=0;i<names.length;i++)
		{
			names[i]=scn.next();
		}
//		for(int i=0;i<names.length;i++)
//		{
//			System.out.println(names[i]);
//		}
		for(String temp:names)
		{
			System.out.println(temp);
		}
		
		
		
		

	}

}
