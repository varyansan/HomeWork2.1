import java.util.Objects;

public class Slizerin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String student, int powerOfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(student, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        checkParam(cunning);
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        checkParam(determination);
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        checkParam(ambition);
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        checkParam(resourcefulness);
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        checkParam(lustForPower);
        this.lustForPower = lustForPower;
    }

    public void checkParam(int param) {
        if (param < 0 || param > 100) {
            System.out.println("Не верный параметр!");
        }
    }

    public void compareSlizerinStudents(Slizerin student) {
        if (getPower() > student.getPower()) {
            System.out.println(this + " лучший студент, чем " + student);
        } else if (getPower() < student.getPower()) {
            System.out.println(student + " лучший студент, чем " + this);
        } else {
            System.out.println("Студенты равны!");
        }
    }

    private int getPower() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Slizerin slizerin = (Slizerin) object;
        return cunning == slizerin.cunning && determination == slizerin.determination && ambition == slizerin.ambition && resourcefulness == slizerin.resourcefulness && lustForPower == slizerin.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, lustForPower);
    }

    public String toStringFullInfo() {
        return "Факультет Слизерин:" +
                "Студент: " + student +
                ", магическая сила: " + powerOfMagic +
                ", трансгрессия: " + transgression +
                ", хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти" + lustForPower;
    }

    @Override
    public String toString() {
        return student;
    }

}
