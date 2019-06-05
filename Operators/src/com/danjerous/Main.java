package com.danjerous;

public class Main {

    public static void main(String[] args) {
	    int result = 10 + 2 - 6 * 20 / 4 ;

	    /*
	    * ++  -- += -= *= /=
	    * &&  || < > >= <= != ==
	    *
	    *  condition ? true : false;
	    * */

	    double doubleVal = 20d;
	    double sndDoubleVal = 80d;
	   double sum = (doubleVal + sndDoubleVal) * 25d;

	    double results = sum % 40d;

        if (results <= 20)
            System.out.println("The total was over the limit.");

    }
}
