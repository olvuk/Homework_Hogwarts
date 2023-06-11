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

    public void compareFacultyPoints(Hogwarts student) {
        int thisFacultyPoints = this.calculateFacultyPoints();
        int studentFacultyPoints = student.calculateFacultyPoints();

        if (thisFacultyPoints < studentFacultyPoints) {
            System.out.println(super.name + " лучший Когтевранец, чем " + student.name);
        }
        else if (thisFacultyPoints > studentFacultyPoints) {
            System.out.println(student.name + " лучший Когтевранец, чем " + super.name);
        }
        else {
            System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
        }
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
