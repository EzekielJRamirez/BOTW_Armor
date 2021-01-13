public class ArmorHelper {
    //    parent class
    // the descendants are zora, anceint, barb
    String name = "help";
    int[] level = {1, 2, 3, 4, 5};

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
