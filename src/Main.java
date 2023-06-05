/**
* Authors : Tebogo Macdonald Seanego and Sam Sifiso Mndebele
* Date : 5 June 2023
* About Programme : Solving for all values of x(real/imaginary), in a quadratic equation ax^2 + bx + c = 0, given the values of a,b and c by the user.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFor ax^2+bx+c=0,  enter the values of a, b and c to solve for x.");

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();

        solveForX(a, b, c);
    }

    /** Function to solve for the values of x, of a quadratic equation, ax^2+bx+c=0.
     * @param a The value of a
     * @param b The value of b
     * @param c The value of c*/
    public static void solveForX(int a, int b, int c) {
        int delta = b * b - 4 * a * c;
        if (delta >= 0) {
            double sqrt = Math.sqrt(delta);
            double x1 = (-b + sqrt)/(2*a);
            double x2 = (-b - sqrt)/(2*a);

            if(x1==x2) {
                System.out.println("\nx = " + x1);
            } else {
                System.out.println("\nx1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        else {
            delta *= -1;
            double n = (double) -b /(2*a);
            double m = Math.sqrt(delta)/(2*a);

            if (n == 0) {
                System.out.println("\nx1 = " + m +"i");
                System.out.println("x2 = - " + m +"i");
            } else  {
                System.out.println("\nx1 = "+n+" + " + m +"i");
                System.out.println("x2 = "+n+" - " + m +"i");
            }
        }
    }
}