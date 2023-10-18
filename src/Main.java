import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean cont = false;
        String contYN;
        String word;
        int random;

        System.out.println("Enter a word or phrase:");
        word = scan.nextLine();

        if (word.length() > 1) {
            do {
                random = (int)(Math.random()*word.length() + 1);
                word = word.substring(0, random) + word.substring(random+1);
                System.out.println("Your new phrase is: " + word);
                if (word.length() > 1) {
                    System.out.println("Again? (Y/N)");
                    contYN = scan.nextLine();
                    if (contYN.equals("N")) {
                        cont = true;
                    }
                }else{
                    System.out.println("Your word/phrase can't be smaller.");
                    cont = true;
                }
            } while (!cont);
        }
        else{
            System.out.println("Your word/phrase can't be smaller.");
        }
    }
}