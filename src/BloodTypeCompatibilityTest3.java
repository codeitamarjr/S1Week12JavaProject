import java.util.Scanner;

public class BloodTypeCompatibilityTest3 {
    // Name Itamar Atanasio Da Silva Junior
    // Code 23952
    public static void main(String[] args) {

        System.out.println("Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-):");

        Scanner keyboard = new Scanner(System.in);
        String bloodType = keyboard.next();
        //*** IF THE USER INPUTS H FOR EXAMPLE

        // JAVA WILL TEST IF THE H IS NOT EQUALS TO ANY REAL BLOOD TYPE, IN THIS CASE NO SO JAVA WILL EXECUTE THE WHILE BLOCK BELLOW
        while ( !bloodType.equals("A+") && !bloodType.equals("O+") & !bloodType.equals("B+") &&
                !bloodType.equals("AB+") && !bloodType.equals("A-") & !bloodType.equals("O-") &&
                !bloodType.equals("B-") && !bloodType.equals("AB-")) {
            System.out.println("Blood type code doesn’t exist, please try again!");
            bloodType = keyboard.next(); //NOW USER CAN ENTER A NEW ONE LIKE B-
        }

        //NOW THE USER HAVE TO IMPUT A VALID NUMBER BETWEEN 1 AND 2, IN THIS EXAMPLE 4
        System.out.println("Do you want to know about giving or receiving (1 for Gives and 2 for Receives):");
        int optionBlood = keyboard.nextInt();

        //JAVA WILL TEST IF THE USER INPUT A VALOR 1 OR 2, IN THIS EX 4 SO JAVA WILL EXECUTE THIS BLOCK
        while (optionBlood<1 | optionBlood>2){
            System.out.println("Choice doesn’t exist, please try again!");
            optionBlood = keyboard.nextInt(); //NOW USER CAN ENTER A VALID NUMBER LETS SAY 2
        }

        //THE USER INPUT 2 FOR THE LAST SO JAVA WILL JUMP THIS BLOCK
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

            //JAVA WILL GET BLOODTYPE WHICH IS B- AND COMPARE WITH EACH CASE
            switch (bloodType) {
                case "A+" -> System.out.println("The blood type for A+ to receive are: A+, ,A-, O+, O-");
                case "O+" -> System.out.println("The blood type for O+ to receive are: O+, O-");
                case "B+" -> System.out.println("The blood type for B+ to receive are: B+, B-, O+, O-");
                case "AB+" -> System.out.println("The blood type for AB+ to receive are: Everyone");
                case "A-" -> System.out.println("The blood type for A- to receive are: A-, O-");
                case "O-" -> System.out.println("The blood type for O- to receive are: O-");
                //JAVA WILL EXECUTE THE STATEMENT BELLOW BECAUSE THE USER INPUT B- IN BLOODTYPE
                case "B-" -> System.out.println("The blood type for B- to receive are: B-, O-");
                case "AB-" -> System.out.println("The blood type for AB- to receive are: AB-, A-, B-, O-");
            }

    }
}
