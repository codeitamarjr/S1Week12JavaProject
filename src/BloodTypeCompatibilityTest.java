import java.util.Scanner;

public class BloodTypeCompatibilityTest {
    // Name Itamar Atanasio Da Silva Junior
    // Code 23952
    public static void main(String[] args) {

        System.out.println("Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-):");

        Scanner keyboard = new Scanner(System.in);
        String bloodType = keyboard.next();
        //*** IF THE USER INPUTS B+ FOR EXAMPLE

        // JAVA WILL TEST IF THE B+ IS NOT EQUALS TO ANY REAL BLOOD TYPE, IN THIS CASE YES SO JAVA WILL JUMP THE WHILE BLOCK
        while ( !bloodType.equals("A+") && !bloodType.equals("O+") & !bloodType.equals("B+") &&
                !bloodType.equals("AB+") && !bloodType.equals("A-") & !bloodType.equals("O-") &&
                !bloodType.equals("B-") && !bloodType.equals("AB-")) {
            System.out.println("Blood type code doesn’t exist, please try again!");
            bloodType = keyboard.next();
        }

        //NOW THE USER HAVE TO IMPUT A VALID NUMBER BETWEEN 1 AND 2, IN THIS EXAMPLE 2
        System.out.println("Do you want to know about giving or receiving (1 for Gives and 2 for Receives):");
        int optionBlood = keyboard.nextInt();

        //JAVA WILL TEST IF THE USER INPUT A VALOR 1 OR 2, IN THIS EX 2 TO JAVA WILL JUMP THIS BLOCK
        while (optionBlood<1 | optionBlood>2){
            System.out.println("Choice doesn’t exist, please try again!");
            optionBlood = keyboard.nextInt();
        }

        //THE USER INPUT 2 SO JAVA WILL JUMP THIS BLOCK
        if(optionBlood==1){

            switch (bloodType) {
                case "A+" -> System.out.println("The blood type for A+ to give are: A+, AB+");
                case "O+" -> System.out.println("The blood type for O+ to give are: O+, A+, B+, AB+");
                case "B+" -> System.out.println("The blood type for B+ to give are: B+, AB+");
                case "AB+" -> System.out.println("The blood type for AB+ to give are: AB+");
                case "A-" -> System.out.println("The blood type for A- to give are: A+, A-, AB+, AB-");
                case "O-" -> System.out.println("The blood type for O- to give are: Everyone");
                case "B-" -> System.out.println("The blood type for B- to give are: B+, B-, AB+, AB-");
                case "AB-" -> System.out.println("The blood type for AB- to give are: AB+, AB-");
            }

        } else

            //JAVA WILL EXECUTE THIS BLOCK
            switch (bloodType) {
                case "A+" -> System.out.println("The blood type for A+ to receive are: A+, ,A-, O+, O-");
                case "O+" -> System.out.println("The blood type for O+ to receive are: O+, O-");
                //JAVA WILL EXECUTE THE CASE BELLOW FOR THE REASON THAT THE USERS INPUT B+ AS BLOODTYPE
                case "B+" -> System.out.println("The blood type for B+ to receive are: B+, B-, O+, O-");
                case "AB+" -> System.out.println("The blood type for AB+ to receive are: Everyone");
                case "A-" -> System.out.println("The blood type for A- to receive are: A-, O-");
                case "O-" -> System.out.println("The blood type for O- to receive are: O-");
                case "B-" -> System.out.println("The blood type for B- to receive are: B-, O-");
                case "AB-" -> System.out.println("The blood type for AB- to receive are: AB-, A-, B-, O-");
            }

    }
}
