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
 *
 * The first goal :I want to check the level of the armor.
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
        int[] Zora = {3,5,8,12,20};
        int[] Ancient = {4,7,12,18,28};
        int[] Barbarian = {3,5,6,7,11};
        String[] caps = {"None", "Zora", "Ancient", "Barbarian"};
        introText(caps);
    }

    public static void introText(String[] caps) {
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
        // the while loop is good when you don't know how many times a sequence may be repeated.
        while (cap > 4 || cap < 1) {
            // write statements to user if they enter unexpected value
            System.out.println("You chose an invalid option: " + cap + "\nPlease make another selection\n");
            cap = clotheSet.nextInt();
        }
        System.out.println("You chose " + caps[cap - 1]);
    }
}