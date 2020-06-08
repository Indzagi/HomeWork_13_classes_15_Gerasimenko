
public class Hospital {
    private Soldier[] hospitalDepartmentForSoldiers = new Soldier[0];
    private Archer[] hospitalDepartmentForArchers = new Archer[0];
    private Mage[] hospitalDepartmentForMages = new Mage[0];


    public Soldier[] treat(Soldier[] soldiers) {

        Soldier[] tempDepartment = new Soldier[0];
        Soldier[] tempDepartment2 = new Soldier[0];
        Soldier[] healthySoldiers = new Soldier[0];
        int tempNumber = 0;
        int tempNumber2 = 0;

        for (int i = 0; i < soldiers.length; i++) {

//            System.out.println(soldiers[i].getHealth()); //Проверка

            if (soldiers[i].getHealth() < 100) {

                tempDepartment = treatSoldiersCheck(soldiers,
                        tempNumber, tempDepartment, i);

                tempNumber++;

            } else if (soldiers[i].getHealth() >= 100) {

                healthySoldiers = new Soldier[tempNumber2 + 1];

                if (tempDepartment2.length > 0) {

                    for (int j = 0; j < tempDepartment2.length; j++) {

                        healthySoldiers[j] = tempDepartment2[j];
                    }
                }

                System.out.println(String.format("%s под  № %d здоров" +
                        " и пригоден к бою", soldiers[i].getTypeName(), i + 1));


                healthySoldiers[tempNumber2] = soldiers[i];

                tempDepartment2 = healthySoldiers;

                tempNumber2++;

            }

        }
        printWithEndings(soldiers, tempNumber);

        soldiers = healthySoldiers;

        return soldiers;
    }


    private Soldier[] treatSoldiersCheck(Soldier[] soldiers,
                                         int tempNumber, Soldier[] tempDepartment, int i) {

        hospitalDepartmentForSoldiers = new Soldier[tempNumber + 1];


        if (tempDepartment.length > 0) {

            for (int j = 0; j < tempDepartment.length; j++) {

                hospitalDepartmentForSoldiers[j] = tempDepartment[j];
            }
        }

        hospitalDepartmentForSoldiers[tempNumber] = soldiers[i];

//        System.out.println(String.format("%s под № %d со здоворьем" +                //Проверка
//                " %d отправляется на лечение", soldiers[i].getTypeName(), i + 1, soldiers[i].getHealth()));


        tempDepartment = hospitalDepartmentForSoldiers;

        return tempDepartment;
    }


    private void printWithEndings(Soldier[] soldiers, int tempNumber) {

        String ending = "ов";
        String temp = "отправлено";

        if (hospitalDepartmentForSoldiers.length == 1) {
            temp = "отправлен";
            ending = "";
        } else if (hospitalDepartmentForSoldiers.length > 1
                && hospitalDepartmentForSoldiers.length < 5) {
            ending = "а";
        }

        if (hospitalDepartmentForSoldiers.length == 0) {
            System.out.println(String.format("Все %sы здоровы," +
                    " никого не отправили на лечение", soldiers[0].getTypeName()));
        } else {
        }
        System.out.println(String.format("%n%d %s%s %s на лечение%n",
                tempNumber, soldiers[0].getTypeName(), ending, temp));

    }

    public Archer[] treat(Archer[] archers) {

        Archer[] tempDepartment = new Archer[0];
        Archer[] tempDepartment2 = new Archer[0];
        Archer[] healthyArchers = new Archer[0];
        int tempNumber = 0;
        int tempNumber2 = 0;

        for (int i = 0; i < archers.length; i++) {

//            System.out.println(archers[i].getHealth());   //Проверка

            if (archers[i].getHealth() < 100) {

                tempDepartment = treatArchersCheck(archers, tempNumber, tempDepartment, i);

                tempNumber++;

            } else if (archers[i].getHealth() >= 100) {

                healthyArchers = new Archer[tempNumber2 + 1];

                if (tempDepartment2.length > 0) {

                    for (int j = 0; j < tempDepartment2.length; j++) {

                        healthyArchers[j] = tempDepartment2[j];
                    }
                }

                System.out.println(String.format("%s под  № %d здоров" +
                        " и пригоден к бою", archers[i].getTypeName(), i + 1));


                healthyArchers[tempNumber2] = archers[i];

                tempDepartment2 = healthyArchers;

                tempNumber2++;

            }

        }
        printWithEndings(archers, tempNumber);

        archers = healthyArchers;

        return archers;
    }


    private Archer[] treatArchersCheck(Archer[] archers, int tempNumber,
                                       Archer[] tempDepartment, int i) {

        hospitalDepartmentForArchers = new Archer[tempNumber + 1];


        if (tempDepartment.length > 0) {

            for (int j = 0; j < tempDepartment.length; j++) {

                hospitalDepartmentForArchers[j] = tempDepartment[j];
            }
        }

        hospitalDepartmentForArchers[tempNumber] = archers[i];

//        System.out.println(String.format("%s под № %d со здоворьем %d" +               //Проверка
//                " отправляется на лечение", archers[i].getTypeName(), i + 1, archers[i].getHealth()));


        tempDepartment = hospitalDepartmentForArchers;

        return tempDepartment;
    }


    private void printWithEndings(Archer[] archers, int tempNumber) {

        String ending = "ов";
        String temp = "отправлено";

        if (hospitalDepartmentForArchers.length == 1) {
            temp = "отправлен";
            ending = "";
        } else if (hospitalDepartmentForArchers.length > 1 &&
                hospitalDepartmentForArchers.length < 5) {
            ending = "а";
        }

        if (hospitalDepartmentForArchers.length == 0) {
            System.out.println(String.format("Все %sы здоровы, никого" +
                    " не отправили на лечение", archers[0].getTypeName()));
        } else {
        }
        System.out.println(String.format("%n%d %s%s %s на лечение%n",
                tempNumber, archers[0].getTypeName(), ending, temp));

    }



    public Mage [] treat(Mage[] mages) {

        Mage[] tempDepartment = new Mage[0];
        Mage[] tempDepartment2 = new Mage[0];
        Mage[] healthyMages = new Mage[0];
        int tempNumber = 0;
        int tempNumber2 = 0;

        for (int i = 0; i < mages.length; i++) {

//            System.out.println(mages[i].getHealth());   //Проверка

            if (mages[i].getHealth() < 100) {

                tempDepartment = treatMagesCheck(mages, tempNumber, tempDepartment, i);

                tempNumber++;

            } else if (mages[i].getHealth() >= 100) {

                healthyMages = new Mage[tempNumber2 + 1];

                if (tempDepartment2.length > 0) {

                    for (int j = 0; j < tempDepartment2.length; j++) {

                        healthyMages[j] = tempDepartment2[j];
                    }
                }

                System.out.println(String.format("%s под  № %d здоров" +
                        " и пригоден к бою", mages[i].getTypeName(), i + 1));


                healthyMages[tempNumber2] = mages[i];

                tempDepartment2 = healthyMages;

                tempNumber2++;

            }

        }
        printWithEndings(mages, tempNumber);

        mages = healthyMages;

        return mages;
    }


    private Mage[] treatMagesCheck(Mage[] mages, int tempNumber, Mage[] tempDepartment, int i) {

        hospitalDepartmentForMages = new Mage[tempNumber + 1];


        if (tempDepartment.length > 0) {

            for (int j = 0; j < tempDepartment.length; j++) {

                hospitalDepartmentForMages[j] = tempDepartment[j];
            }
        }

        hospitalDepartmentForMages[tempNumber] = mages[i];

//        System.out.println(String.format("%s под № %d со здоворьем %d" +       //Проверка
//                " отправляется на лечение", mages[i].getTypeName(), i + 1, mages[i].getHealth()));

        tempDepartment = hospitalDepartmentForMages;

        return tempDepartment;
    }


    private void printWithEndings(Mage[] mages, int tempNumber) {

        String ending = "ов";
        String temp = "отправлено";

        if (hospitalDepartmentForMages.length == 1) {
            temp = "отправлен";
            ending = "";
        } else if (hospitalDepartmentForMages.length > 1 &&
                hospitalDepartmentForMages.length < 5) {
            ending = "а";
        }

        if (hospitalDepartmentForMages.length == 0) {
            System.out.println(String.format("Все %sы здоровы," +
                    " никого не отправили на лечение", mages[0].getTypeName()));
        } else {
        }
        System.out.println(String.format("%n%d %s%s %s на лечение%n",
                tempNumber, mages[0].getTypeName(), ending, temp));

    }

}
