public class BarbarianClass extends ArmorHelper {
    String name = "Barbarian";
    int[] level = {3, 5, 6, 7, 11};


    //    public static void setString{}
    //    public static void getString{}
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getDefense(int i) {
        return level[i];
    }

    public int[] getLevel() {
        return level;
    }
}
