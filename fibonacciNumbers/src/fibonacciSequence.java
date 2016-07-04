/**
 * Created by anatolii on 04.07.16.
 */
public class fibonacciSequence {
    private static int length = 46; //maximum - 46, because of integer capacity
    private static boolean useRecurcive = false;
    public static void main(String[] args){

        if(useRecurcive) {
            for (int i = 1; i <= length; i++) {
                int currentNumber = fibonacciRecurcive(i);
                System.out.print(currentNumber + ", ");
            }
        } else {
            for (int i = 1; i <= length; i++) {
                int currentNumber = nonRecurciveFibonacci(i);
                System.out.print(currentNumber + ", ");
            }
        }


    }

    public static int fibonacciRecurcive(int numberOfElement){
        if(numberOfElement == 1 || numberOfElement == 2){
            return 1;
        }
        return fibonacciRecurcive(numberOfElement - 1) + fibonacciRecurcive(numberOfElement - 2);
    }


    public static int nonRecurciveFibonacci(int numberOfElement){
        if(numberOfElement == 1 || numberOfElement == 2){
            return 1;
        }
        int previousOne=1, previousTwo=1, current=1;
        for(int i= 3; i<= numberOfElement; i++){
            current = previousOne + previousTwo;
            previousOne = previousTwo;
            previousTwo = current;

        }
        return current;
    }
}

