abstract class Hogwarts {
    String name;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    abstract int calculateFacultyPoints();

    public int calculateGeneralPoints() {
        return this.magicPower + this.transgressionDistance;
    }

    abstract void printBestStudent(Hogwarts bestStudent, Hogwarts worstStudent);

    public void compare(Hogwarts student) {
        if (this.getClass().equals(student.getClass())) {
            compareFacultyPoints(student);
        } else {
            compareGeneralPoints(student);
        }
    }

    public void compareFacultyPoints(Hogwarts student) {
        int thisFacultyPoints = this.calculateFacultyPoints();
        int studentFacultyPoints = student.calculateFacultyPoints();

        if (thisFacultyPoints < studentFacultyPoints) {
            printBestStudent(student, this);
        }
        else if (thisFacultyPoints > studentFacultyPoints) {
            printBestStudent(this, student);
        }
        else {
            System.out.println(student.name + " и " + this.name + " набрали одинаковое количество очков");
        }
    }

    public void compareGeneralPoints(Hogwarts student) {
        int thisGeneralPoints = this.calculateGeneralPoints();
        int studentGeneralPoints = student.calculateGeneralPoints();

        if (thisGeneralPoints < studentGeneralPoints) {
            System.out.println(student.name + " сильнее, чем " + this.name);
        }
        else if (thisGeneralPoints == studentGeneralPoints) {
            System.out.println(this.name + " и " + student.name + " равны по силе");
        }
        else {
            System.out.println(this.name + " сильнее, чем " + student.name);
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + "; Сила магии: " + magicPower + "; Расстояние трансгрессии: " + transgressionDistance;
    }
}
