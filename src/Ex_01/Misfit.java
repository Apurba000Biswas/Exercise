package Ex_01;


/*
 * ==================== Task Assignment (Assignment)===========================
Write a function that takes a list of strings and prints them in the following format.

Example 1:  input ["Wellcome", "to", "misfit"] gets printed as:
Wellcome
	   to
	    misfit

Example 2:  input ["programming", "is", "my", “passion”] gets printed as:
programming
	      is
	       my
            passion	
	       	
Special Instruction: Try to use the least number of built in function

 */

public class Misfit {
	
	public static void main(String[] args) {
		Misfit object = new Misfit();
		
		// Test 1
		String[] array = {"Wellcome", "to", "misfit"};
		object.runWithArray(array);
		// Test 2
		String[] array2 = {"programming", "is", "my", "passion"};
		object.runWithArray(array2);
	}
	
	private void runWithArray(String[] strArray) {
		String output = "";
		int numOfSpace = 0;
		
		for(String str : strArray) {
			output += str + "\n";
			numOfSpace += str.length()-1;
			output  += addSpace(numOfSpace);
		}
		
		System.out.println(output);
	}
	
	private String addSpace(int numOfSpace) {
		String out = "";
		for(int i=0; i<numOfSpace; i++) {
			out += " ";
		}
		
		return out;
	}
	
	
	
	
	
	
	
	
}

