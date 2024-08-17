
/**
 * The class calculates Pi and Euler constants
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Samuel Awud <Samuel.Awud@seattlecolleges.edu>
 * @version __________
 */


public class Calculus {
    /*The method run the program to display results of π and ℇ values*/
    public static void main(String[] args) {
      for (int i = 1; i <= 30; i++) {
            double result = pi(i);
            System.out.println("Pi value after " + i + " term(s) = " + result);
        }
        for (int n = 1; n <= 18; n++) {
           System.out.println("Euler value after " + n + " term(s) = " + euler(n));
       }
      
    }
    /*The method calculates the Pi Constant (π) after n termns*/
    public static double pi(int n) {
        double pi = 0;
        for (int i = 0; i < n; i++) {
            double numerator = Math.pow(-1, i);
            double denominator = (2 * i) + 1;
            double exponent = Math.pow(3,i);
            pi += numerator / (denominator * exponent);
        }
        pi *= Math.sqrt(12);
        return pi;
    }

    /*The method calculates the Euler Constant (ℇ) after n termns*/
    public static double euler(int n) {
        double sum = 0;
        for (int j = 0; j < n; j++) {
            double a = Math.exp(-Math.log(factorial(j)));
            sum += a;
        }
        return sum;
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}