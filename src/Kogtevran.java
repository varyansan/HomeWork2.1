import java.util.Objects;

public class Kogtevran extends hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String student, int powerOfMagic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(student, powerOfMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setMind(int mind) {
        checkParam(mind);
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        checkParam(wisdom);
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        checkParam(wit);
        this.wit = wit;
    }

    public void setCreation(int creation) {
        checkParam(creation);
        this.creation = creation;
    }

    public void checkParam(int param) {
        if (param < 0 || param > 100) {
            System.out.println("Не верный параметр!");
        }
    }

    public void compareKogtevranStudents(Kogtevran student) {
        if (getPower() > student.getPower()) {
            System.out.println(this + " лучший студент, чем " + student);
        } else if (getPower() < student.getPower()) {
            System.out.println(student + " лучший студент, чем " + this);
        } else {
            System.out.println("Студенты равны!");
        }
    }

    private int getPower() {
        return mind + wisdom + wit + creation;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kogtevran kogtevran = (Kogtevran) object;
        return mind == kogtevran.mind && wisdom == kogtevran.wisdom && wit == kogtevran.wit && creation == kogtevran.creation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mind, wisdom, wit, creation);
    }

    public String toStringFullInfo() {
        return "Факультет Когтевран:" +
                "Студент: " + student +
                ", магическая сила: " + powerOfMagic +
                ", трансгрессия: " + transgression +
                ", ум: " + mind +
                ", мудрость: " + wisdom +
                ", остроумие: " + wit +
                ", творчество: " + creation;
    }

    @Override
    public String toString() {
        return student;
    }
}
