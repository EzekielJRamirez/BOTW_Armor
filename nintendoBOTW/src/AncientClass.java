public class AncientClass extends ArmorHelper {
    String name = "Ancient";
    int[] level = {4, 7, 12, 18, 28};

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