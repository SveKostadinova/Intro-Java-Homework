package homework;

import java.util.Scanner;
/**
 * Created by User on 3/20/2016.
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        String[] ghettoNumbers = { "Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack" };
        Scanner decimalNumber = new Scanner(System.in);
        String number = decimalNumber.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            result.append(ghettoNumbers[Integer.parseInt(number.substring(i, i + 1))]);
        }
        System.out.println(result.toString());
}
}
