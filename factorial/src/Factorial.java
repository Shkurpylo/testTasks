import java.math.BigInteger;

/**
 * Created by anatolii on 05.07.16.
 */
public class Factorial {

    public static void main(String[] args){
        int n = 14;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; ++i){
            result = result.multiply(BigInteger.valueOf(i));}

        System.out.print(result);
    }
}
