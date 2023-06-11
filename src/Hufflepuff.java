public class Hufflepuff extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    void printBestStudent(Hogwarts bestStudent, Hogwarts worstStudent) {
        System.out.printf("%s лучший Пуффендуец, чем %s%n", bestStudent.name, worstStudent.name);
    }

    @Override
    int calculateFacultyPoints() {
        return this.hardWork + this.loyalty + this.honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "; Трудолюбие: " + hardWork + "; Верность: " + loyalty + "; Честность: " + honesty;
    }
}
