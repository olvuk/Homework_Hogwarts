public class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    void printBestStudent(Hogwarts bestStudent, Hogwarts worstStudent) {
        System.out.printf("%s лучший Когтевранец, чем %s%n", bestStudent.name, worstStudent.name);
    }

    @Override
    int calculateFacultyPoints() {
        return this.intelligence + this.wit + this.creativity + this.wisdom;
    }

    @Override
    public String toString() {
        return super.toString() + "; Ум: " + intelligence + "; Мудрость: " + wisdom + "; Остроумие: " + wit + "; Творчество: " + creativity;
    }
}
