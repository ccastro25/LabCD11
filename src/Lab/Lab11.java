package Lab;

import java.util.Scanner;

/**
 * Created by castro on 9/9/16.
 */
public class Lab11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please Enter your name");
        String UsersName = scanner.nextLine();

        if(UsersName.equalsIgnoreCase("Alice") || UsersName.equalsIgnoreCase("bob")){
            System.out.println("True");}

        else{ System.out.print("False");}
    }
}
