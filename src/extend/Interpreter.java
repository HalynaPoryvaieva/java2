package extend;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #10 ext
 *
 * @author Sergey Iryupin
 * @version 8-Feb-24
 */
public class Interpreter {

    static int[] values = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] tokens = null;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            tokens = line.split(" ");
            switch (tokens[0]) {
                case "print":
                    if ( tokens.length < 2 )
                        System.out.println("Error: variable name is missing");
                    else
                        printValue(tokens[1]);
                    break;
                case "exit":
                    System.out.println("Exit from interpreter.");
                    break;
                default:
                    assignValue(line);
            }
        } while (!tokens[0].equals("exit"));
    }

    static void assignValue(String line) {

        if ( line.indexOf("=") == -1 ) {
            System.out.println("Error: missing assignment symbol '='");
            return;
        }

        String[] tokens = line.split("=");

        if ( tokens.length < 2 ) {
            System.out.println("Error: variable name is missing");
            return;
        }

        String varName = tokens[0].trim();
        String varValue = tokens[1].trim();

        if ( varName.length() > 1 ) {
            System.out.println("Error: variable name is too long");
            return;
        }
        else if ( varName.length() < 1 ) {
            System.out.println("Error: variable name is missing");
            return;
        }
        else if ( varValue.length() < 1 ) {
            System.out.println("Error: variable name is missing");
            return;
        }

        for (int i=0; i<varValue.length(); i++) {
            if ( varValue.charAt(i) < '0' || varValue.charAt(i) > '9' ) {
                System.out.println("Error: wrong variable value (not integer)");
                return;
            }
        }

        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    static void printValue(String varName) {

        if ( varName.length() > 1 ) {
            System.out.println("Error: variable name is too long");
            return;
        }
        else if ( varName.length() < 1 ) {
            System.out.println("Error: variable name is missing");
            return;
        }

        int idx = varName.charAt(0) - 'a';
        System.out.println(values[idx]);
    }
}
