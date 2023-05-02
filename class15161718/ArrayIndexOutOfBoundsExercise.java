//In these exercise you will work on exception, you will have to implement:
//ArrayIndexOutOfBounds with an array of 6 elements, trying to reach the ninth element.
package class15161718;

public class ArrayIndexOutOfBoundsExercise {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5};

        try {
            int ninthElement = arr[8];
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
