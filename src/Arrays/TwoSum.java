package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    //@author: Kaushik Banerjee
    // Problem: https://leetcode.com/problems/two-sum/
    // Problem Statement: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    public static int[] twoSum(int[] nums,int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                     return new int[]{i,j};
               }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Provide size of array");
        int size;
        size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Provide elements of array ");
        for(int i=0;i<size;i++){
            nums[i] = scanner.nextInt();
        }
        System.out.print("Provide target ");
        int target;
        target = scanner.nextInt();
            int[] result = twoSum(nums, target);
            if(result!=null)
                System.out.println("target indices in "+ Arrays.toString(result));
            else
                System.out.println("No such indices found");
    }
}
