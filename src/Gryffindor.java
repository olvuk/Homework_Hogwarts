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

    @Override
    void printBestStudent(Hogwarts bestStudent, Hogwarts worstStudent) {
        System.out.printf("%s лучший Гриффиндорец, чем %s%n", bestStudent.name, worstStudent.name);
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
