package arrays;

import java.util.Arrays;
 

public class MoveZeros {
	public static void main(String[] args) {
		int[] a = { 0, 1, 19, 0, 23,12,0,1,34,0,56 };
		int[] returnValue = moveZeroEnd(a);
		System.out.println(Arrays.toString(returnValue));
	}

	public static int[] moveZeroEnd(int[] inputArray) {
		if(inputArray == null || inputArray.length == 0) {
			return new int[] {};
		}
		 int start=0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0 ) {
				inputArray[start++] = inputArray[i]; 
			}
			 
		}
        while(start < inputArray.length){
            inputArray[start++]=0;
        }
		return inputArray;
	}
	
}