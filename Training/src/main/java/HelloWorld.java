import java.io.IOException;
import java.util.Scanner;
/**
 * Created by holkins on 2017-05-18.
 */
public class HelloWorld {

    public static void main(String args[]) throws IOException {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello world!");

        while(true) {
            System.out.println("Please write 'exit' and tap ENTER to close");

            if (userInput.next().equals("exit")) {
                System.exit(0);
            }
        }


    }
}