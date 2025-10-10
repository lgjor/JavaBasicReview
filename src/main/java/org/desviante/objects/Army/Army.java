package org.desviante.objects.Army;

class Army {

    public static void createArmy() {
        Unit unit = new Unit("Chuck Norris");
        Unit unit2 = new Unit("Rocky Balboa");
        Unit unit3 = new Unit("Anderson Silva");
        Unit unit4 = new Unit("Aspas");
        Unit unit5 = new Unit("Rodney");
        Knight knight = new Knight("Valdorf");
        Knight knight2 = new Knight("Gandalf");
        Knight knight3 = new Knight("Logan");
        General general = new General("Zagalo");
        Doctor doctor = new Doctor("Hannibal");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}