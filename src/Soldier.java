
public class Soldier extends Unit {


    public Soldier(int health, int armor, int strength,
                   String typeName) {
        super(health, armor, strength, typeName);
    }

    public void wallShield(String typeName) {

        System.out.println(String.format("%s использует специальную" +
                " способность: \"Стена щитов\" ", typeName));
    }

}
