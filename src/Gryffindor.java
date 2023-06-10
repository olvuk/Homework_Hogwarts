public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareGryffindorStudents(Hogwarts student) {
        if (student instanceof Gryffindor) {
            if ((nobility + honor + bravery) < (((Gryffindor) student).nobility + ((Gryffindor) student).honor + ((Gryffindor) student).bravery)) {
                System.out.println(super.name + " лучший Гриффиндорец, чем " + student.name);
            }
            else if ((nobility + honor + bravery) > (((Gryffindor) student).nobility + ((Gryffindor) student).honor + ((Gryffindor) student).bravery)) {
                System.out.println(student.name + " лучший Гриффиндорец, чем " + super.name);
            }
            else {
                System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
            }
        }
        else {
            System.out.println(student.name + " не учится на факультете Гриффиндор");
        }
    }


    @Override
    public String toString() {
        return super.toString() + "; Благородство: " + nobility + "; Честь: " + honor + "; Храбрость: " + bravery;
    }
}
