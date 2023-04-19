//Siguiendo las normas de nombrado de la sesión 12, diseña dos funciones limpias.

package class121314;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(5);

        System.out.println(calculateAverage(numbers));

        System.out.println(checkPalindrome("radar"));
    }
    public static double calculateAverage(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public static boolean checkPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
}

