package com.GitHub_Updates;
//Operators are symbols that performs a particular task and 
//based on the type of operation operators are classified.

public class Operators_in_Java_Bitwise_Operators {
	/*Bitwise operators
 1) & (bitwise AND)
 2) | (bitwise inclusive OR)
 3) ^ (bitwise exclusive OR)
	 */
	public static void main(String[] args) {
		//logical operators if first condition is false means it won't check next condition.
		//bitwise operators if first condition is false also it doesn't matter it even checks second condition.
		//but result will be same for both.  
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println("logical operator");
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  (logical operator)
		System.out.println("bitwise operator");
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked  
		System.out.println("");
		System.out.println("logical operator");
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println("bitwise operator");
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked    
	}

}
