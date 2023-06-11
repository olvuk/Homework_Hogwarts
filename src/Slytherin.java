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

    public void compareFacultyPoints(Hogwarts student) {
        int thisFacultyPoints = this.calculateFacultyPoints();
        int studentFacultyPoints = student.calculateFacultyPoints();

        if (thisFacultyPoints < studentFacultyPoints) {
            System.out.println(super.name + " лучший Слизеринец, чем " + student.name);
        }
        else if (thisFacultyPoints > studentFacultyPoints) {
            System.out.println(student.name + " лучший Слизеринец, чем " + super.name);
        }
        else {
            System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
        }
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
