public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void compareRavenclawStudents(Hogwarts student) {
        if (student instanceof Ravenclaw) {
            if ((intelligence + wisdom + wit + creativity) < (((Ravenclaw) student).intelligence + ((Ravenclaw) student).wisdom + ((Ravenclaw) student).wit) + ((Ravenclaw) student).creativity) {
                System.out.println(super.name + " лучший Когтевранец, чем " + student.name);
            }
            else if ((intelligence + wisdom + wit + creativity) > (((Ravenclaw) student).intelligence + ((Ravenclaw) student).wisdom + ((Ravenclaw) student).wit) + ((Ravenclaw) student).creativity) {
                System.out.println(student.name + " лучший Когтевранец, чем " + super.name);
            }
            else {
                System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
            }
        }
        else {
            System.out.println(student.name + " не учится на факультете Когтевран");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; Ум: " + intelligence + "; Мудрость: " + wisdom + "; Остроумие: " + wit + "; Творчество: " + creativity;
    }
}
