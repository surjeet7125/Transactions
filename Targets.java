package com.greatlearning.transactions;

import java.util.Scanner;

public class Targets {

   public static void main(String[] args) throws Exception{
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the transaction count");
	int size = sc.nextInt(); //size = 3
	int arr[] = new int[size]; // array size  = 3, 0, 1,2
	System.out.println("enter the values  as per the size ") ;
	
	for(int i=0;i<size;i++)
	{
		arr[i] = sc.nextInt(); //0 -rs 100 pass this to some other iteration data store
							
	}
	
	System.out.println("enter the target value");
	int targetNo = sc.nextInt(); // 2 , target  =100 and 2nd target = rs 200
	
	while(targetNo-- !=0) { 
		int flag = 0; //
		long target; 
		
	System.out.println("enter a total target value"); //Target value 50
	target = sc.nextLong();
	
	long sum =0	;
	
	
	for(int i=0;i<size;i++) {
		
		sum += arr[i]; /// 10,20,30 sum = 0+10 = 100, sum = 100+50 = 150,  sum = 150+ 200 = 350
		
		if(sum>=target) {
			System.out.println("Target reached");
			flag = 1;
			break;
		}
		
		
	}
	
	if(flag == 0) {
		System.out.print("Target not reached");
	}

			
	}
	
	
}

}