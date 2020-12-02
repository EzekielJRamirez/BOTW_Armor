import java.util.*; // for scanning user's response

/**
 * Ezekiel Ramirez
 * Start 11/26/20
 * End ##/##/##
 * <p>
 * This program displays different stats
 * based on what armor is being worn.
 * I want to take information from the user
 * and make calls to constructors from
 * another java program.
 * <p>
 * The first goal :I want to check the level of the armor.
 * <p>
 * Checked by James Austin
 */

public class ArmorStats {
    public static void main(String[] args) {
        System.out.println("This is program will calculate different variables based on armor you select");

        /*
        you should prolly use these integer arrays somewhere
        all you're outputting is the name of the cap
        i recommend various combinations that will then be saved
        to an array or array list which the user can equip armors to
        then you can prompt the user at any point if they want to
        calculate the armor total
        */

        int[] Defense = new int[3];
        String[] mySet = {"head", "shoulders", "knees"};//new String[3];
        // with mySet I plan to overwrite the given values with the armor
        // the player chose to wear
        String[] caps = {"None", "Zora", "Ancient", "Barbarian"};
        Defense[0] = introText(caps, mySet[0]);
//        Defense[1] = introText(tunics, mySet[1]);
//        Defense[2] = introText(shoes, mySet[2]);

        int totalDefense = Defense[0] + Defense[1] + Defense[2];
        System.out.println("Your total defense value is " + totalDefense + " and you currently wear;" +
                mySet[0]);
    }

    public static int introText(String[] caps, String mySet) {
        int[] Zora = {3, 5, 8, 12, 20};
        int[] Ancient = {4, 7, 12, 18, 28};
        int[] Barbarian = {3, 5, 6, 7, 11};
        Scanner clotheSet = new Scanner(System.in);
        System.out.println("The armor is linked to a number, please select what cap you wish to wear");
        System.out.println("1 " + caps[0] + "\n2 " + caps[1] + "\n3 " + caps[2] + "\n4 " + caps[3] + "\n");

        /*
        Nice job with the error checking for user's incorrect input however
        allow the user to end program on their own instead of having the program
        end once they have chosen all the possible options
          (in this there's only one option, the cap)
        */
        // make a loop that acts when an unexpected value is selected
        int cap = clotheSet.nextInt();
        String setName = caps[cap - 1];
        // the while loop is good when you don't know how many times a sequence may be repeated.
        while (cap > 4 || cap < 1) {
            // write statements to user if they enter unexpected value
            System.out.println("You chose an invalid option: " + cap +
                    "\nPlease make another selection or quit the program\n");
            cap = clotheSet.nextInt();
        }
        System.out.println("You chose " + setName + "\nYou can make another selection or end the program");
        System.out.println("Please select the level of your cap" +
                "\nLevel: 1\nLevel: 2\nLevel: 3\nLevel: 4\nLevel: 5");
        mySet = setName;
        //mySet should be updating the current region of armor
        //it is not referencing anything currently
        cap = clotheSet.nextInt();

        while (cap > 5 || cap < 1) {
            System.out.println("You chose an invalid option: " + cap +
                    "\nPlease make another selection or quit the program\n");
            cap = clotheSet.nextInt();
        }

        if (setName.equals("Zora")) {
            //use zora values
            mySet = "Zora";
            System.out.println("Your " + setName + " cap has a defense stat of " + Zora[cap - 1]);
            return Zora[cap - 1];
        } else if (setName.equals("Ancient")) {
            //use ancient values
            System.out.println("Your " + setName + " cap has a defense stat of " + Ancient[cap - 1]);
            return Ancient[cap - 1];
        } else if (setName.equals("Barbarian")) {
            //use barbarian values
            System.out.println("Your " + setName + " cap has a defense stat of " + Barbarian[cap - 1]);
            return Barbarian[cap - 1];
        }

        System.out.println("You chose to forgo this armor, very brave");
        return 0;
    }
}