//In these exercise you will work on exception, you will have to implement:
//FileNotFound trying to access a file that does not exist.
package class15161718;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExercise {

    public static void main(String[] args) throws FileNotFoundException {

        try (FileReader fr = new FileReader(("text.txt"))) {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.println((char) content);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

