/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Vraj Patel, vpp36@scarletmail.rutgers.edu, vpp36
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {
        int numberOne = Integer.parseInt(args[0]);
        int numberTwo = Integer.parseInt(args[1]);
        int numberThree = Integer.parseInt(args[2]);
        int numberFour = Integer.parseInt(args[3]);
        int numberFive = Integer.parseInt(args[4]);
        if (numberOne >= numberTwo && numberOne >= numberThree && numberOne >= numberFour && numberOne >= numberFive){
            System.out.println(numberOne);
        }
        else if (numberTwo >= numberOne && numberTwo >= numberThree && numberTwo >= numberFour && numberTwo >= numberFive){
            System.out.println(numberTwo);
        }
        else if (numberThree >= numberOne && numberThree >= numberTwo && numberThree >= numberFour && numberThree >= numberFive){
            System.out.println(numberThree);
        }
        else if (numberFour >= numberOne && numberFour >= numberTwo && numberFour >= numberThree && numberFour >= numberFive){
            System.out.println(numberFour);
        }
        else if (numberFive >= numberOne && numberFive >= numberTwo && numberFive >= numberThree && numberFive >= numberFour){
            System.out.println(numberFive);
        }
        // WRITE YOUR CODE HERE
    }
}