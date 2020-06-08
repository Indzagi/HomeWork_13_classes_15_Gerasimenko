
public class Unit {
    private int health;
    private int armor;
    private int strength;
    private String typeName;

    public Unit(int health, int armor, int strength, String typeName) {
    this.health = health;
    this.armor = armor;
    this.strength = strength;
    this.typeName = typeName;
    }


    public void go() {
        System.out.println(String.format("%s идет вперед", typeName));
    }

    public void stop() {
        System.out.println(String.format("%s остановился", typeName));
    }

    public void attack() {
        System.out.println(String.format("%s атакует", typeName));
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getHealth() {
        return health;
    }


}
