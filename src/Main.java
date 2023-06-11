public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 98, 71, 100, 57, 100);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 100, 96, 100, 100, 89);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 70, 73, 100, 100, 89);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 97, 95, 95, 96, 99, 88, 99);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 58, 70, 84, 82, 72, 68, 77);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 51, 67, 70, 84, 90, 76, 81);
        Hufflepuff zahariaSmyth = new Hufflepuff("Захария Смит", 91, 87, 98, 87, 90);
        Hufflepuff sedricDiggory = new Hufflepuff("Седрик Диггори", 84, 97, 70, 81, 76);
        Hufflepuff justinFinchFletchly = new Hufflepuff("Джастин Финч-Флетчли", 71, 79, 80, 74, 81);
        Ravenclaw chzhouChang = new Ravenclaw("Чжоу Чанг", 88, 97, 58, 77, 69, 74);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 68, 78, 98, 48, 91, 100);
        Ravenclaw markusBelby = new Ravenclaw("Маркус Белби", 98, 66, 74, 85, 88, 94);

        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontague);
        System.out.println(gregoryGoyle);
        System.out.println(zahariaSmyth);
        System.out.println(sedricDiggory);
        System.out.println(justinFinchFletchly);
        System.out.println(chzhouChang);
        System.out.println(padmaPatil);
        System.out.println(markusBelby);

        harryPotter.compare(grahamMontague);
        gregoryGoyle.compare(chzhouChang);
        grahamMontague.compare(hermioneGranger);
        harryPotter.compare(hermioneGranger);
        hermioneGranger.compare(harryPotter);
        gregoryGoyle.compare(harryPotter);
        justinFinchFletchly.compare(sedricDiggory);
        ronWeasley.compare(hermioneGranger);


    }
}