//In these exercise you will work on exception, you will have to implement:
//Arithmetic exception trying to divide two numbers, with the divisor being 0.
package class15161718;

public class ArithmeticExceptionExercise {

    public static void main(String[] args) {

        try {
            System.out.println(division(5, 0));
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
    public static int division(int n1, int n2) throws ArithmeticException {
        return n1/n2;
    }
}
