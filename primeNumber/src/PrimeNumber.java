import java.util.Scanner;

/**
 * Created by anatolii on 04.07.16.
 */
public class PrimeNumber {

    public static void main(String[] args){
        String input = new String();
        Scanner scanner = new Scanner(System.in);
        while(true){
            input = scanner.next();
            if(input.equals("exit")){
                System.out.println("See you!");
                break;
            }
            int testNum = Integer.parseInt(input);
            if(testNum == 1){                                           //base case one
                System.out.println("This number is NOT prime.");
            } else if(testNum == 2 || testNum == 3){                    //base case two
                System.out.println("This number is prime.");
            } else if(testNum % 1 == 0 && testNum % testNum == 0 && testNum % 2 != 0 && testNum % 3 != 0) {
                System.out.println("This number is prime.");
            } else {
                System.out.println("This number is NOT prime.");
            }
            System.out.println("Input next number or print \"exit\" to exit");
        }
    }
}
