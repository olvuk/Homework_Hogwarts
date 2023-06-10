public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareHufflepuffStudents(Hogwarts student) {
        if (student instanceof Hufflepuff) {
            if ((hardWork + loyalty + honesty) < (((Hufflepuff) student).hardWork + ((Hufflepuff) student).loyalty + ((Hufflepuff) student).honesty)) {
                System.out.println(super.name + " лучший Пуффендуец, чем " + student.name);
            }
            else if ((hardWork + loyalty + honesty) > (((Hufflepuff) student).hardWork + ((Hufflepuff) student).loyalty + ((Hufflepuff) student).honesty)) {
                System.out.println(student.name + " лучший Пуффендуец, чем " + super.name);
            }
            else {
                System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
            }
        }
        else {
            System.out.println(student.name + " не учится на факультете Пуффендуй");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "; Трудолюбие: " + hardWork + "; Верность: " + loyalty + "; Честность: " + honesty;
    }
}
