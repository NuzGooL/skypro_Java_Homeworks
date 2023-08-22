package P2_JavaCore.HW02_OOP_P1;

public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String fullname, int spellPower, int apparitionDistance, int nobility, int honor, int courage) {
        super(fullname, spellPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public Gryffindor(String fullname) {
        super(fullname);
        java.util.Random random = new java.util.Random();
        nobility = random.nextInt(100);
        honor = random.nextInt(100);
        courage = random.nextInt(100);
    }

    @Override
    public void printStudent() {
        System.out.println(getFullname() + " [spellPower=" + getSpellPower() + ", apparitionDistance=" + getApparitionDistance() + ']' + "{nobility=" + nobility + ", honor=" + honor + ", courage=" + courage + "}");
    }

    public void challengeGryffindor(Gryffindor gryffindor) {
        if (nobility + honor + courage > gryffindor.nobility + gryffindor.honor + gryffindor.courage) {
            System.out.println(getFullname() + " лучший Гриффиндорец, чем " + gryffindor.getFullname());
        } else if (nobility + honor + courage < gryffindor.nobility + gryffindor.honor + gryffindor.courage) {
            System.out.println(gryffindor.getFullname() + " лучший Гриффиндорец, чем " + getFullname());
        } else System.out.println(getFullname() + " такой же хороший Гриффиндорец как и " + gryffindor.getFullname());
    }
}