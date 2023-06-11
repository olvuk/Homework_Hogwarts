public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    void printBestStudent(Hogwarts bestStudent, Hogwarts worstStudent) {
        System.out.printf("%s лучший Слизеринец, чем %s%n", bestStudent.name, worstStudent.name);
    }

    @Override
    int calculateFacultyPoints() {
        return this.determination + this.cunning + this.ambition + this.resourcefulness + this.thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "; Хитрость: " + cunning + "; Решительность: " + determination + "; Амбициозность: " + ambition + "; Находчивость: " + resourcefulness + "; Жажда власти: " + thirstForPower;
    }
}
