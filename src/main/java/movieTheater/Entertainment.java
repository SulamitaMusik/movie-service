package movieTheater;

import java.util.Locale;
import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Hello, Welcome.Please choose a movie theatre");
        System.out.println("AMC| Regal| Fandango");
        String theater = scan.nextLine().toUpperCase(Locale.ROOT);

                switch(theater){

                    case"AMC":
                        break;
                    case"FANDANGO":
                        break;
                    case"REGAL":
                        break;
                }

    }
}
