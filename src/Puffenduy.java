public class Puffenduy extends hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffenduy(String student, int powerOfMagic, int transgression, int hardWork, int loyalty, int honesty) {
        super(student, powerOfMagic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHardWork(int hardWork) {
        checkParam(hardWork);
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        checkParam(loyalty);
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        checkParam(honesty);
        this.honesty = honesty;
    }

    public void checkParam(int param) {
        if (param < 0 || param > 100) {
            System.out.println("Не верный параметр!");
        }
    }

    public void comparePuffenduyStudents(Puffenduy student) {
        if (getPower() > student.getPower()) {
            System.out.println(this + " лучший студент, чем " + student);
        } else if (getPower() < student.getPower()) {
            System.out.println(student + " лучший студент, чем " + this);
        } else {
            System.out.println("Студенты равны!");
        }
    }

    private int getPower() {
        return hardWork + loyalty + honesty;
    }

    public String toStringFullInfo() {
        return "Факультет Пуффендуй:" +
                "Студент: " + student +
                ", магическая сила: " + powerOfMagic +
                ", трансгрессия: " + transgression +
                ", трудолюбие: " + hardWork +
                ", верность: " + loyalty +
                ", честность: " + honesty;
    }

    @Override
    public String toString() {
        return student;
    }

}
