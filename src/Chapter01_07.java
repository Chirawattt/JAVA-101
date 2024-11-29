import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter01_07 {
    public static void main(String[] args) {
        int total;
        int counter;
        int score;
        double average;
        Scanner scan = new Scanner(System.in);

        // initialization phase
        total = 0;
        counter = 0;
        // processing phase
        // get first grade from user
        System.out.print("Enter Integer Score or -1 to Quit: ");
        score = scan.nextInt();
        // loop until sentinel value read from user
        while (score != -1) {
            total = total + score; // add score to total
            counter = counter + 1;
            // get next score from user
            System.out.print("Enter Integer Score or -1 to Quit: ");
            score = scan.nextInt();
        } // end while

        DecimalFormat twoDigits = new DecimalFormat("0.00");
        // if user enter ed at least one score...
        if (counter != 0) {
            // calculate average of all scores enterd
            average = (double)total / counter;
            // display average with two digits of precision
            System.out.println("Class average is " + twoDigits.format(average));
        } // end if part of if...else
        else {
            System.out.println("No scores were entered.");
        }
     }
}
