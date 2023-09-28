package P2_JavaCore.HW02_OOP_P1;

public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер");
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер");
        Gryffindor ronaldWeasley = new Gryffindor("Рон Уизли");
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой");
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю");
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл");
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит");
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори");
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли");
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг");
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил");
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби");

        harryPotter.printStudent();
        hermioneGranger.printStudent();
        dracoMalfoy.printStudent();
        zachariasSmith.printStudent();
        choChang.printStudent();

        harryPotter.challengeGryffindor(hermioneGranger);
        zachariasSmith.challengeHufflepuff(cedricDiggory);
        choChang.challengeRavenclawr(padmaPatil);
        dracoMalfoy.challengeSlytherin(grahamMontague);
        
        harryPotter.challenge(dracoMalfoy);
    }
}
