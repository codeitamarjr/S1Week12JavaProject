import java.util.Scanner;

public class BloodTypeCompatibility {
    // Name Itamar Atanasio Da Silva Junior
    // Code 23952
    public static void bloodTest () {
        Scanner keyboard = new Scanner(System.in); //create a new object to read from the keyboard information


        System.out.println("Do you want to know about giving or receiving (1 for Gives and 2 for Receives):");
        int optionBlood = keyboard.nextInt(); // Ask for the user to input the option of Give or Receive, 1 or 2.



        System.out.println("Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-):");

        String bloodType = keyboard.next(); // Ask user to input their blood type following the instruction printed above

        while ( !bloodType.equals("A+") && !bloodType.equals("O+") && !bloodType.equals("B+") &&
                !bloodType.equals("AB+") && !bloodType.equals("A-") && !bloodType.equals("O-") &&
                !bloodType.equals("B-") && !bloodType.equals("AB-")) {
            System.out.println("Blood type code doesn’t exist, please try again!");
            // In a WHILE the variable is not equals to A+ and O+ and so on, the JAVA will read and execute this line
            // asking for the user to input the correct blood type...
            bloodType = keyboard.next();
        } // IF the variable bloodType is correct this block will be jumped



        while (optionBlood<1 | optionBlood>2){ // In a WHILE the option is not GIVE or RECEIVE this line will be repeated
            // until the user input the correct option of Give or Receive which is 1 or 2.
            System.out.println("Choice doesn’t exist, please try again!");
            optionBlood = keyboard.nextInt();
        } // If the variable optionBlood is 1 or 2 the whole block will be jumped

        // If the optionBlood is 1 which means GIVE the JAVA will execute the statements bellow:
        if(optionBlood==1){

            // The test will analyse the bloodType for each case:
            switch (bloodType) {
                //If the bloodType is A+ the statement bellow will be printed and Java will stop, If is not the next case will be tested
                case "A+" -> {Identification.fullName();System.out.print("The blood type for A+ to give are: A+, AB+");}
                //If the bloodType is O+ the statement bellow will be printed and Java will stop and so on...
                case "O+" -> {Identification.fullName();System.out.print("The blood type for O+ to give are: O+, A+, B+, AB+");}
                case "B+" -> {Identification.fullName();System.out.print("The blood type for B+ to give are: B+, AB+");}
                case "AB+" -> {Identification.fullName();System.out.print("The blood type for AB+ to give are: AB+");}
                case "A-" -> {Identification.fullName();System.out.print("The blood type for A- to give are: A+, A-, AB+, AB-");}
                case "O-" -> {Identification.fullName();System.out.print("The blood type for O- to give are: Everyone");}
                case "B-" -> {Identification.fullName();System.out.print("The blood type for B- to give are: B+, B-, AB+, AB-");}
                case "AB-" -> {Identification.fullName();System.out.print("The blood type for AB- to give are: AB+, AB-");}
            }

        } else //If the user chose number 2 the statements bellow will be executed by Java

            // The test will analyse the bloodType for each case:
            switch (bloodType) {
                //If the bloodType is A+ the statement bellow will be printed and Java will stop, If is not the next case will be tested
                case "A+" -> {Identification.fullName();System.out.print("The blood type for A+ to receive are: A+, ,A-, O+, O-");}
                //If the bloodType is O+ the statement bellow will be printed and Java will stop and so on...
                case "O+" -> {Identification.fullName();System.out.print("The blood type for O+ to receive are: O+, O-");}
                case "B+" -> {Identification.fullName();System.out.print("The blood type for B+ to receive are: B+, B-, O+, O-");}
                case "AB+" -> {Identification.fullName();System.out.print("The blood type for AB+ to receive are: Everyone");}
                case "A-" -> {Identification.fullName();System.out.print("The blood type for A- to receive are: A-, O-");}
                case "O-" -> {Identification.fullName();System.out.print("The blood type for O- to receive are: O-");}
                case "B-" -> {Identification.fullName();System.out.print("The blood type for B- to receive are: B-, O-");}
                case "AB-" -> {Identification.fullName();System.out.print("The blood type for AB- to receive are: AB-, A-, B-, O-");}
            }

    }
}
