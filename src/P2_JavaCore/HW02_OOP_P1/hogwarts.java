package P2_JavaCore.HW02_OOP_P1;

public class hogwarts {
    private String fullname;
    private int spellPower;
    private int apparitionDistance;

    public String getFullname() {
        return fullname;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public hogwarts(String fullname, int spellPower, int apparitionDistance) {
        this.fullname = fullname;
        this.spellPower = spellPower;
        this.apparitionDistance = apparitionDistance;
    }

    public hogwarts(String fullname) {
        this.fullname = fullname;
        java.util.Random random = new java.util.Random();
        spellPower = random.nextInt(100);
        apparitionDistance = random.nextInt(100);
    }

    public void printStudent() {
        System.out.println(fullname + " [spellPower=" + spellPower + ", apparitionDistance=" + apparitionDistance + ']');
    }

    public void challenge(hogwarts hogwarts) {
        if (spellPower > hogwarts.spellPower) {
            System.out.println(fullname + " обладает бОльшей мощностью магии, чем " + hogwarts.fullname);
        } else if (spellPower < hogwarts.spellPower) {
            System.out.println(hogwarts.fullname + " обладает бОльшей мощностью магии, чем " + fullname);
        } else System.out.println(fullname + " и " + hogwarts.fullname + " равны по мощьности магии");

        if (apparitionDistance > hogwarts.apparitionDistance) {
            System.out.println(fullname + " обладает бОльшей дальностью трансгрессии, чем " + hogwarts.fullname);
        } else if (apparitionDistance < hogwarts.apparitionDistance) {
            System.out.println(hogwarts.fullname + " обладает бОльшей дальностью трансгрессии, чем " + fullname);
        } else System.out.println(fullname + " и " + hogwarts.fullname + " равны по дальности трансгрессии");
    }
}
