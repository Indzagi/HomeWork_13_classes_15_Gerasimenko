
public class Mage extends Unit {
    private int magicPower;

    public Mage(int health, int armor, int strength,
                String typeName, int magicPower) {
        super(health, armor, strength, typeName);
    }

    public void castMagic(String typeName) {
        System.out.println(String.format("%s атакует специальной" +
                " магической атакой", typeName));
    }

}
