package homework;

import java.util.Scanner;

/**
 * Created by User on 3/20/2016.
 */
public class PrintACharacterTriangle {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int heigh = Integer.parseInt(reader.next());
        int secondCounter = heigh - 1;
        for (int counter = 0; counter < heigh*2; counter++) {
            if (counter < heigh) {
                printElement(counter);
            }
            else{
                printElement(--secondCounter);
            }
        }
    }

    public static void printElement(int numberOfElement) {
        char c = 'a';
        for (int i=0; i <= numberOfElement; i++, c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
