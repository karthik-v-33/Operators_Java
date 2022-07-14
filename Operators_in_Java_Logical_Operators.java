package com.GitHub_Updates;
//Operators are symbols that performs a particular task and 
//based on the type of operation operators are classified.

public class Operators_in_Java_Logical_Operators {
	/*Logical operators
	 *Logical operators are used to determine the logic between variables or values.
	 *Logical operators are used to check whether an expression is true or false. They are used in decision making.
 1) &&  (Logical AND)
 2) ||  (Logical OR)
 3) !   (Logical NOT)
	 */
	public static void main(String[] args) {
		//logical operators if first condition is false means it won't check next condition.
		//bitwise operators if first condition is false also it doesn't matter it even checks second condition.
		//but result will be same for both.
		// && operator
		System.out.println("&& operator");
		System.out.println((5 > 3) && (8 > 5));  // true
		System.out.println((5 > 3) && (8 < 5));  // false
		System.out.println("");
		// || operator
		System.out.println("|| operator");
		System.out.println((5 < 3) || (8 > 5));  // true
		System.out.println((5 > 3) || (8 < 5));  // true
		System.out.println((5 < 3) || (8 < 5));  // false
		System.out.println("");
		// ! operator
		System.out.println("! operator");
		System.out.println(!(5 == 3));  // true
		System.out.println(!(5 > 3));  // false
		System.out.println("");
	}

}
