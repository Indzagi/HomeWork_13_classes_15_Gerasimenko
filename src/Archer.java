
public class Archer extends Unit {
    private int rangedPower;

    public Archer(int health, int armor, int strength,
                  String typeName, int rangedPower) {
        super(health, armor, strength, typeName);
        this.rangedPower = rangedPower;
    }

    public void distanceShot(String typeName) {
        System.out.println(String.format("%s атакует специальной" +
                " дальней атакой", typeName));
    }

}
