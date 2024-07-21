import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Grifindor harryPotter = new Grifindor("Гарри Поттер", 100, 80, 100, 96, 100);
        Grifindor hermioneGranger = new Grifindor("Гермиона Грейнджер", 100, 100, 100, 100, 100);
        Grifindor ronWeasley = new Grifindor("Рон Уизли", 75, 60, 100, 98, 100);

        Slizerin dracoMalfoy = new Slizerin("Драко Малфой", 95, 100, 100, 63, 80, 100, 55);
        Slizerin grahamMontague = new Slizerin("Грэхэм Монтегю", 63, 77, 95, 94, 100, 91, 100);
        Slizerin gregoryGoyle = new Slizerin("Грегори Гойл", 100, 45, 100, 64, 89, 90, 100);

        Puffenduy zahariyaSmith = new Puffenduy("Захария Смит", 78, 65, 100, 96, 100);
        Puffenduy sedrikDiggory = new Puffenduy("Седрик Диггори", 98, 100, 80, 69, 97);
        Puffenduy justinFinletchly = new Puffenduy("Джастин Финч-Флетчли", 84, 73, 95, 88, 94);

        Kogtevran jouChang = new Kogtevran("Чжоу Чанг", 84, 92, 96, 81, 100, 92);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", 99, 77, 91, 61, 49, 88);
        Kogtevran marcusBelby = new Kogtevran("Маркус Белби", 71, 100, 73, 90, 73, 67);

        System.out.println(harryPotter.toStringFullInfo());
        System.out.println(hermioneGranger.toStringFullInfo());
        System.out.println(ronWeasley.toStringFullInfo());
        System.out.println();
        System.out.println(dracoMalfoy.toStringFullInfo());
        System.out.println(grahamMontague.toStringFullInfo());
        System.out.println(gregoryGoyle.toStringFullInfo());
        System.out.println();
        System.out.println(zahariyaSmith.toStringFullInfo());
        System.out.println(sedrikDiggory.toStringFullInfo());
        System.out.println(justinFinletchly.toStringFullInfo());
        System.out.println();
        System.out.println(jouChang.toStringFullInfo());
        System.out.println(padmaPatil.toStringFullInfo());
        System.out.println(marcusBelby.toStringFullInfo());
        System.out.println();
        hermioneGranger.compareGriffindorStudents(harryPotter);
        dracoMalfoy.compareSlizerinStudents(grahamMontague);
        sedrikDiggory.comparePuffenduyStudents(zahariyaSmith);
        jouChang.compareKogtevranStudents(padmaPatil);
        System.out.println();
        hogwarts.compareHogwartsStudents(sedrikDiggory, harryPotter);
    }
}