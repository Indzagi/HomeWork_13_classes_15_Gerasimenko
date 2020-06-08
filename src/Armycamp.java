import java.util.Scanner;

public class Armycamp {


    private Soldier[] soldiers;
    public Archer[] archers;
    public Mage[] mages;
    private Scanner scanner = new Scanner(System.in);

    public void armyFormationMain(Hospital hospital) {
        System.out.println("Добрый день! Армейский лагерь приветсует Вас!!!");

        soldiers = initializationSoldiers();
        archers = initializationArchers();
        mages = initializationMages();

        soldiers = hospital.treat(soldiers);
        archers = hospital.treat(archers);
        mages = hospital.treat(mages);
    }

    private Soldier[] initializationSoldiers() {
        String typeName = "Воин";
        String ending;
        int minHp = 70;
        int maxHp = 200;
        Soldier[] soldiers = new Soldier[requestNumberOfAnyType(typeName)];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier(randomNumbers(minHp, maxHp),
                    randomNumbers(50, 100), randomNumbers(50, 100), typeName);
        }

        if (soldiers.length == 1) {
            ending = "а";
        } else {
            ending = "ов";
        }

        System.out.println(String.format("Вы создали %d %s%s в вашей" +
                " новой Армии%n", soldiers.length, soldiers[0].getTypeName(), ending));

        return soldiers;
    }

    private Archer[] initializationArchers() {
        String typeName = "Лучник";
        String ending;
        int minHp = 50;
        int maxHp = 150;
        Archer[] archers = new Archer[requestNumberOfAnyType(typeName)];
        for (int i = 0; i < archers.length; i++) {
            archers[i] = new Archer(randomNumbers(minHp, maxHp), randomNumbers(50, 100),
                    randomNumbers(50, 100), typeName, randomNumbers(50, 100));
        }

        if (soldiers.length == 1) {
            ending = "а";
        } else {
            ending = "ов";
        }

        System.out.println(String.format("Вы создали %d %s%s в вашей" +
                " новой Армии%n", archers.length, archers[0].getTypeName(), ending));

        return archers;
    }

    private Mage[] initializationMages() {
        String typeName = "Маг";
        String ending;
        int minHp = 40;
        int maxHp = 120;
        Mage[] mages = new Mage[requestNumberOfAnyType(typeName)];
        for (int i = 0; i < mages.length; i++) {
            mages[i] = new Mage(randomNumbers(minHp, maxHp), randomNumbers(50, 100),
                    randomNumbers(50, 100), typeName, randomNumbers(50, 100));
        }

        if (soldiers.length == 1) {
            ending = "а";
        } else {
            ending = "ов";
        }

        System.out.println(String.format("Вы создали %d %s%s в вашей новой" +
                " Армии%n", mages.length, mages[0].getTypeName(), ending));

        return mages;
    }

    private int requestNumberOfAnyType(String typeName) {
        System.out.println(String.format("Введите желаемое кол-во %sов в армии...", typeName));
        return scanner.nextInt();
    }

    private int randomNumbers(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    public Soldier[] getSoldiers() {
        return soldiers;
    }


    public Archer[] getArchers() {
        return archers;
    }

    public Mage[] getMages() {
        return mages;
    }

}
