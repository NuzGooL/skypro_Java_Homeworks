package P2_JavaCore.HW02_OOP_P1;

import java.util.Random;

public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int leadership;

    public Slytherin(String fullname, int spellPower, int apparitionDistance, int cunning, int determination, int ambition, int resourcefulness, int leadership) {
        super(fullname, spellPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public Slytherin(String fullname) {
        super(fullname);
        Random random = new Random();
        cunning = random.nextInt(100);
        determination = random.nextInt(100);
        ambition = random.nextInt(100);
        resourcefulness = random.nextInt(100);
        leadership = random.nextInt(100);
    }
    @Override
    public void printStudent() {
        System.out.println(getFullname() + " [spellPower=" + getSpellPower() + ", apparitionDistance=" + getApparitionDistance() + ']' +
                "{cunning=" + cunning + ", determination=" + determination + ", ambition=" + ambition + ", resourcefulness=" + resourcefulness + ", leadership=" + leadership + "}");
    }

    public void challengeSlytherin(Slytherin slytherin) {
        if (cunning + determination + ambition + resourcefulness + leadership > slytherin.cunning + slytherin.determination + slytherin.ambition + slytherin.resourcefulness + slytherin.leadership) {
            System.out.println(getFullname()+" лучший Слизеринец, чем "+slytherin.getFullname());
        } else if (cunning + determination + ambition + resourcefulness + leadership < slytherin.cunning + slytherin.determination + slytherin.ambition + slytherin.resourcefulness + slytherin.leadership) {
            System.out.println(slytherin.getFullname()+" лучший Слизеринец, чем "+getFullname());
        } else System.out.println(getFullname()+" такой же хороший Слизеринец как и "+slytherin.getFullname());
    }
}
