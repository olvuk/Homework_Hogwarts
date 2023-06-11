public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareFacultyPoints(Hogwarts student) {
        int thisFacultyPoints = this.calculateFacultyPoints();
        int studentFacultyPoints = student.calculateFacultyPoints();

        if (thisFacultyPoints < studentFacultyPoints) {
                System.out.println(super.name + " лучший Гриффиндорец, чем " + student.name);
        }
        else if (thisFacultyPoints > studentFacultyPoints) {
                System.out.println(student.name + " лучший Гриффиндорец, чем " + super.name);
        }
        else {
                System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
        }
    }

    @Override
    int calculateFacultyPoints() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "; Благородство: " + nobility + "; Честь: " + honor + "; Храбрость: " + bravery;
    }
}
