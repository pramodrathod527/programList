package velocityList;

import java.util.Scanner;

//An Armstrong is sum of digit in number placed the power of each digit and
//add it togather and it should be equals to the original number

//An Armstrong number of three digits is an integer such that the 
//sum of the cubes of its digits is equal to the number itself. 

//For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.


public class ArmstrongNumber {
	
	
	public static boolean isArmstrong(int num) {
		
		int temp;
		int digit = 0;
		int sum = 0;
		int last = 0;
		
		//to calculate number of digit
		temp = num;
		while(temp>0) {
			temp = temp/10;
			digit++;
		}
		
		temp = num;
		
		while(temp>0) {
			last = temp%10;
			sum += Math.pow(last, digit);
			temp = temp/10;
		}
		
		if(num==sum) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter number here");
//		
//		int number = sc.nextInt();
//		
//		if(isArmstrong(number)) {
//			System.out.println(number+" is Armstrong Number");
//		}
//		else {
//			System.out.println(number+" is not Armstrong Number");
//		}
		
		
		//for checking Armstrong between Range 
		
		for(int i=0;i<=999;i++) {
			if(isArmstrong(i)) {
				System.out.println(i+" is Armstrong Number");
			}
//			else {
//				System.out.println(i+" is not Armstrong Number");
//			}
		
		}
		
		
		

	}

}
