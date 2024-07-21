import java.util.Objects;

public class Grifindor extends hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(String student, int powerOfMagic, int transgression, int nobility, int honor, int bravery) {
        super(student, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        checkParam(nobility);
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        checkParam(honor);
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        checkParam(bravery);
        this.bravery = bravery;
    }
    public void checkParam(int param) {
        if (param < 0 || param > 100) {
            System.out.println("Не верный параметр!");
        }
    }

    public void compareGriffindorStudents(Grifindor student) {
        if (getPower() > student.getPower()) {
            System.out.println(this + " лучший студент, в сравнении с " + student);
        } else if (getPower() < student.getPower()) {
            System.out.println(student + " лучший студент, в сравнении с " + this);
        } else {
            System.out.println("Студенты равны!");
        }
    }

    private int getPower() {
        return nobility + honor + bravery;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Grifindor grifindor = (Grifindor) object;
        return nobility == grifindor.nobility && honor == grifindor.honor && bravery == grifindor.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }

    public String toStringFullInfo() {
        return "Факультет Гриффиндор:" +
                "Студент: " + student +
                ", магическая сила: " + powerOfMagic +
                ", трансгрессия: " + transgression +
                ", благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery;
    }

    @Override
    public String toString() {
        return student;
    }
}
