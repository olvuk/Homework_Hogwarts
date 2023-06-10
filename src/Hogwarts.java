public class Hogwarts {
    String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void compareMagicPower(Hogwarts student) {
        if (this.magicPower < student.magicPower) {
            System.out.println(student.name + " обладает бОльшей мощностью магии, чем " + this.name);
        }
        else if (this.magicPower == student.magicPower) {
            System.out.println(this.name + " обладает такой же мощностью магии, как " + student.name);
        }
        else {
            System.out.println(this.name + " обладает бОльшей мощностью магии, чем " + student.name);
        }
    }

    public void comparetransgressionDistance(Hogwarts student) {
        if (this.transgressionDistance < student.transgressionDistance) {
            System.out.println(student.name + " обладает бОльшим расстоянием трансгрессии, чем " + this.name);
        }
        else if (this.transgressionDistance == student.transgressionDistance) {
            System.out.println(this.name + " обладает таким же расстоянием трансгрессии, как " + student.name);
        }
        else {
            System.out.println(this.name + " обладает бОльшим расстоянием трансгрессии, чем " + student.name);
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + "; Сила магии: " + magicPower + "; Расстояние трансгрессии: " + transgressionDistance;
    }
}
