package com.gabriel;

public class Main {

    public static void main(String[] args) {
	//declaring an array
    int[] intArray = new int[7];

    //populating the array
    intArray[0] = 20;
    intArray[1] = 35;
    intArray[2] = -15;
    intArray[3] = 7;
    intArray[4] = 55;
    intArray[5] = 1;
    intArray[6] = -22;

    //index by default is set to -1 to indicate there is no value in the array that fits the request
    int index = -1;
    //looping through the array
    for(int i = 0; i < intArray.length; i++){
        //requesting to see if the array contains a certain number
        if(intArray[i] == 7) {
            //sets the var index to the index containing this value
            index = i;
            break;
        }
    }

    //displaying the index containing the value or -1 to indicate the value is not in the array
    System.out.println("index = " + index );
    }
}
