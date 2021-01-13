import java.util.*;

public class ArmorSecond {

    public static void main(String[] args) {
        // introduce program to user
        System.out.println("This program will ask you about your armor set up");
        String cap = chooseHelm();

        if (cap.equalsIgnoreCase("Zora")) {
            ArmorHelper zoram = new ZoraClass();
            chooseLvl(zoram);
            // call the chooseLvl method using the zora info
        } else if (cap.equalsIgnoreCase("Ancient")) {
            ArmorHelper ancient = new AncientClass();
            chooseLvl(ancient);
            // call the chooseLvl method using the ancient info
        } else {
            ArmorHelper barbarian = new BarbarianClass();
            chooseLvl(barbarian);
            // call the chooseLvl method using the barbarian info
        }

//        ArmorHelper zoram = new ZoraClass();
//        String test = zoram.getName();
//        System.out.println(zoram.getName());
//
//        zoram.setName("Zeekle");
//        test = zoram.getName();
//        System.out.println(test);
    }

    public static String chooseHelm() {
        boolean loopHelm;
        Scanner console = new Scanner(System.in);
        ArmorHelper zoram = new ZoraClass();
        ArmorHelper ancient = new AncientClass();
        ArmorHelper barb = new BarbarianClass();

        // ask the user what armor they want to wear
        System.out.println("What helmet would you like to wear?");
        String[] sets = {zoram.getName(), ancient.getName(), barb.getName()};

        // initialize set variable
        int userSet;
        do {
            // run program to ask what helmet you want to wear
            // repeat only the part where the user is asked to choose a hemet
//            System.out.println("1: " + sets[0] + "\n2: " + sets[1] + "\n3: " + sets[2]);
            for (int i = 1; i <= sets.length; i++) {
                System.out.println(i + ": " + sets[i - 1]);
                // using this loop allows me to add new armor to the sets list more
                // easily and display that information more conveniently
            }


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
            // levi broke the loop by typing a word instead of a number

            // displays user's choice
            System.out.println("You chose to wear the " + sets[userSet - 1] + " helmet");

            // ask if they will choose another helmet
            System.out.println("Would you like to choose another helmet?\n(Y)es\t(N)o");

            String yesNo = console.next();

            loopHelm = yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes");
        } while (loopHelm); // I am not sure how to make the program ask user to repeat themselves if they fail
        // to answer yes or no

        System.out.println("Thank you for playing");
        return sets[userSet -1];
    }

    public static void chooseLvl(ArmorHelper set) {
        Scanner console = new Scanner(System.in);
        boolean loopLvl;

        System.out.println();
        System.out.println("You chose to wear the "+ set.getName()+" cap");

        do{
            System.out.print("What level is your cap?");
            System.out.println(" Each level corresponds to a defense amount");
            for (int i = 1; i <= set.getLevel().length; i++) {
                System.out.println(i + ": " + set.getDefense(i - 1));
                // this loop allows me to adjust the size of some armor levels
                // more conveniently and display that information
            }

            int userChoice;

            boolean loop = true;
            do {
                // take in user choice
                userChoice = console.nextInt();
                if (userChoice < 1 || userChoice > set.getLevel().length) {
                    System.out.println("Your choice was invalid, please make another selection");
                } else {
                    loop = false;
                }
            } while (loop);

            // display the armor level
            System.out.println("The " + set.getName() + " cap is at level " + userChoice + " with a defense value of " +
                    set.getDefense(userChoice - 1));

            // ask if they want another level
            System.out.println("Are you comfortable with this level?\n(Y)es\t(N)o");

            String yesNo = console.next();

            loopLvl = yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("no");

        } while (loopLvl);

        System.out.println("Thank you for playing!");
    }
}
