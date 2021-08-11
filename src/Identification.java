import java.util.Scanner;

public class Identification {
    private static String firstName;
    private static String secondName;

    public static void name(){
        System.out.println("Please Input your first name: ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.println("Please Input your last name: ");
        String surname = keyboard.nextLine();
        firstName = name;
        secondName = surname;
    }

    public static void fullName(){
        System.out.print(firstName+" "+secondName+"; ");
    }


}
