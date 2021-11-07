/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Vraj Patel, vpp36@scarletmail.rutgers.edu, vpp36
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long number = Long.parseLong(args[0]);
        int oddDigit = 0;
        int evenDigit = 0;
        int sum1 = 0;
        int sum2 = 0;
        int digitCheck = 0;
            while (number >0){
                oddDigit = (int)(number % 10);
                sum1 += oddDigit;
                number /= 10;
                    if (number >0){
                        evenDigit =(int)(number % 10);
                        sum2 += evenDigit;
                        number /= 10;
                    }
            }
        sum1 = sum1 % 10;
        sum2 = sum2 % 10;
        sum2 = sum2 * 3;
        sum2 = sum2 % 10;
        digitCheck = sum1 + sum2;
        digitCheck = digitCheck % 10;
        System.out.println(digitCheck);

        // WRITE YOUR CODE HERE
    }
}