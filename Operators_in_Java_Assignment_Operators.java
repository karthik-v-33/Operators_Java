package com.GitHub_Updates;
//Operators are symbols that performs a particular task and 
//based on the type of operation operators are classified.

public class Operators_in_Java_Assignment_Operators {
/*Assignment operators
 *Assignment operators are used to assign values to variables.
 1) = 
 2) +=
 3) -=
 4) *=
 5) /=
 6) %=
*/
	public static void main(String[] args) {
	
		// create variables
	    int a = 4;
	    int var;

	    // assign value using =
	    var = a;
	    System.out.println("var using =: " + var);

	    // assign value using +=
	    var += a;
	    System.out.println("var using +=: " + var);

	    // assign value using *=
	    var *= a;
	    System.out.println("var using *=: " + var);
	    
	    // assign value using /=
	    var /= a;
	    System.out.println("var using /=: " + var);
	    
	    // assign value using %=
	    var %= a;
	    System.out.println("var using %=: " + var);
	}

}
