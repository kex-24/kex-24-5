public class MagicalCreature {

    String name;
    int magicPower;
    int agility;
    boolean isFriendly;

    public MagicalCreature(String name, int magicPower, int agility, boolean isFriendly) {
        this.name = name;
        this.magicPower = magicPower;
        this.agility = agility;
        this.isFriendly = isFriendly;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getAgility() {
        return agility;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setFriendly(boolean isFriendly) {
        this.isFriendly = isFriendly;
    }

    public void printInfor(MagicalCreature creature) {
        System.out.println("Name: " + creature.getName());
        System.out.println("Magic: " + creature.getMagicPower());
        System.out.println("Agility: " + creature.getAgility());
        System.out.println("Friendly: " + creature.isFriendly());

    }

    public static void main
    {
        MagicalCreature buck = new MagicalCreature("Buckbeak", 8, 7, true);

        System.out.println("This is your magical creature: ");
        System.out.println("Name: ");
        System.out.println("magic: ");
        System.out.println("agility: ");
        System.out.println("Friendly: ");
    }

}
