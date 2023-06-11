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

    public void compareFacultyPoints(Hogwarts student) {
        int thisFacultyPoints = this.calculateFacultyPoints();
        int studentFacultyPoints = student.calculateFacultyPoints();

        if (thisFacultyPoints < studentFacultyPoints) {
            System.out.println(super.name + " лучший Пуффендуец, чем " + student.name);
        }
        else if (thisFacultyPoints > studentFacultyPoints) {
            System.out.println(student.name + " лучший Пуффендуец, чем " + super.name);
        }
        else {
            System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
        }
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
