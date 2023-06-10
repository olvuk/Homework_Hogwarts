public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void compareSlytherinStudents(Hogwarts student) {
        if (student instanceof Slytherin) {
            if ((cunning + determination + ambition + resourcefulness + thirstForPower) < (((Slytherin) student).cunning + ((Slytherin) student).determination + ((Slytherin) student).ambition) + ((Slytherin) student).resourcefulness + ((Slytherin) student).thirstForPower) {
                System.out.println(super.name + " лучший Слизериновец, чем " + student.name);
            }
            else if ((cunning + determination + ambition + resourcefulness + thirstForPower) > (((Slytherin) student).cunning + ((Slytherin) student).determination + ((Slytherin) student).ambition) + ((Slytherin) student).resourcefulness + ((Slytherin) student).thirstForPower)  {
                System.out.println(student.name + " лучший Слизериновец, чем " + super.name);
            }
            else {
                System.out.println(student.name + " и " + super.name + " набрали одинаковое количество очков");
            }
        }
        else {
            System.out.println(student.name + " не учится на факультете Слизерин");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; Хитрость: " + cunning + "; Решительность: " + determination + "; Амбициозность: " + ambition + "; Находчивость: " + resourcefulness + "; Жажда власти: " + thirstForPower;
    }
}
