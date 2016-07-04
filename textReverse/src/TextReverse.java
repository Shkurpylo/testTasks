import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by anatolii on 04.07.16.
 */
public class TextReverse {
    public static void main(String[] args) throws IOException {
        System.out.println("input your text in one row:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] charArr = text.toCharArray();
        for(int i = charArr.length - 1; i >= 0; i--){
            System.out.print(charArr[i]);
        }
    }

}
