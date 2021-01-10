import java.util.*;

public class ArmorSecond {
    public static void main(String[] args) {
        // introduce program to user
        System.out.println("This program will ask you about your armor set up");
        chooseHelm();
    }

    public static void chooseHelm() {
        boolean loopHelm;
        Scanner console = new Scanner(System.in);

        // ask the user what armor they want to wear
        System.out.println("What helmet would you like to wear?");
        String[] sets = {"Zora", "Ancient", "Barbarian"};

        do {
            // run program to ask what helmet you want to wear
            // repeat only the part where the user is asked to choose a hemet
            System.out.println("1: " + sets[0] + "\n2: " + sets[1] + "\n3: " + sets[2]);

            // initialize set variable
            int userSet;

            // make a loop that triggers if the users set choice is invalid
            boolean loop = true;
            do {
                // take in user choice
                userSet = console.nextInt();
                if (userSet < 1 || userSet > sets.length) {
                    System.out.println("Your choice was invalid, please make another selection");
                } else {
                    loop = false;
                }
            } while (loop);

            // displays user's choice
            System.out.println("You chose to wear the " + sets[userSet - 1] + " helmet");

            // ask if they will choose another helmet
            System.out.println("Would you like to choose another helmet?\n(Y)es\t(N)o");

            String yesNo = console.next();

            loopHelm = yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes");
        } while (loopHelm);

        System.out.println("Thank you for playing");
    }
}
