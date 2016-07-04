import java.util.Random;

/**
 * Created by anatolii on 05.07.16.
 */
public class SwapArray {
    public static void main(String[] args) {
        int[] array = randomArray(10);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }

        System.out.println(" ");
        System.out.println("arter swapping:  ");

        int[] reverseArr = swap(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(reverseArr[i] + ", ");
        }

    }
    public static int[] randomArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 10000));
        }
        return array;
    }
    public static int[] swap(int[] array) {
        int[] reversed = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversed[(reversed.length - 1) - i] = array[i];
        }
        return reversed;


    }
}
