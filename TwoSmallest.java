/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Vraj Patel, vpp36@scarletmail.rutgers.edu, vpp36
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 1.0 35.0 2.0 1.1 6.9 0.3 6.7
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
        Double smallNum1 = Double.MAX_VALUE;
        Double smallNum2 = Double.MAX_VALUE;
            for (int j = 0; j < args.length; j++) {
                double activeNumber = Double.parseDouble(args[j]);
                    if (smallNum1 > activeNumber) {
                        smallNum2 = smallNum1;
                        smallNum1 = activeNumber;
                    }
                    else if (smallNum2 > activeNumber) {
                        smallNum2 = activeNumber;
                    }
            }
            System.out.println(smallNum1);
            System.out.println(smallNum2);
	// WRITE YOUR CODE HERE
    }

}
