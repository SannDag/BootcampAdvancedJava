//Implement the use of command-line arguments as we learned in class 19. (args)

package class192021;

import java.util.Arrays;
//The idea of the app is to pass a number from the terminal and have it sorted in ascending order.
public class Main {
    public static void main(String[] args) {

        String numStr = args[0];

        char[] digits = numStr.toCharArray();
        Arrays.sort(digits);

        for(int i = 0; i < digits.length; i++){
            StringBuilder numReversed = new StringBuilder(Character.toString(digits[i]));
            numReversed.reverse();
            System.out.print(Integer.parseInt(String.valueOf(numReversed)));
        }

    }
}
