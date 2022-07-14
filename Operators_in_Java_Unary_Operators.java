package com.GitHub_Updates;
//Operators are symbols that performs a particular task and 
//based on the type of operation operators are classified.

public class Operators_in_Java_Unary_Operators {
/*Unary operators
 *Unary operators are used with only one operand.
 1) ++
 2) --
*/
	public static void main(String[] args) {
		  
	    // declare variables
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println("value = "+x);
		System.out.println(++x);//12  
		System.out.println("value = "+x);
		System.out.println(x--);//12 (11)  
		System.out.println("value = "+x);
		System.out.println(--x);//10
		System.out.println("value = "+x);
	}

}
