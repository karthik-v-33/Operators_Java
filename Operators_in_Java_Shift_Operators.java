package com.GitHub_Updates;
//Operators are symbols that performs a particular task and 
//based on the type of operation operators are classified.

public class Operators_in_Java_Shift_Operators {
	/*Shift operators
	 *Arithmetic operators are used to perform common mathematical operations.
 1) <<   (The Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.)
 2) >>   (The Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.)
 3) >>>  
	 */
	public static void main(String[] args) {

		System.out.println("left shift operator");
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80
		System.out.println("");

		System.out.println("right shift operator");
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println("");

		System.out.println("Shift Operator");
		//For positive number, >> and >>> works same  
		System.out.println(20>>2);  
		System.out.println(20>>>2);  
		//For negative number, >>> changes parity bit (MSB) to 0  
		System.out.println(-20>>2);  
		System.out.println(-20>>>2);  

	}

}
