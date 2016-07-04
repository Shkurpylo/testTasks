/**
 * Created by anatolii on 05.07.16.
 */
//if

public class ReverseNumber {
    public static void main(String[] args){
        int number = 456;
        Integer integer = new Integer(number);
        String temporary = integer.toString();
        char[] charArr = temporary.toCharArray();

        for(int i = charArr.length - 1; i >= 0; i--){
            System.out.print(charArr[i]);
        }
    }
}
