import java.util.Random;

/**
 * Created by anatolii on 05.07.16.
 */
public class findMinandMax {
    public static void main(String[] args){
        int[] array = randomArray(100);
        int[] result = findMinAndMaxNumberInArray(array);
        System.out.print("the smallest number in array is: " + result[0] + "\n"
                + "the biggest number in array is: " + result[1]);

    }
    public static int[] randomArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 10000));
        }
        return array;
    }

    public static int[] findMinAndMaxNumberInArray(int[] array){
        int[] resultsMinMax = new int[2];
        resultsMinMax[0]= array[0];
        resultsMinMax[1] = array[0];
        for(int i = 1; i < array.length; i++){
            resultsMinMax[0] = resultsMinMax[0] < array[i] ? resultsMinMax[0] : array[i];
            resultsMinMax[1] = resultsMinMax[1] > array[i] ? resultsMinMax[1] : array[i];
        }
        return resultsMinMax;
    }
}
