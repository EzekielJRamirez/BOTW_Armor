public class ZoraClass extends ArmorHelper {
    String name = "Zora";
    int[] level = {3, 5, 8, 12, 20};

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
