public abstract class hogwarts {
    String student;
    int powerOfMagic;
    int transgression;

    public hogwarts(String student, int powerOfMagic, int transgression) {
        this.student = student;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getStudent() {
        return student;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        checkParam(powerOfMagic);
        this.powerOfMagic = powerOfMagic;
    }

    public void setTransgression(int transgression) {
        checkParam(transgression);
        this.transgression = transgression;
    }

    public void checkParam(int param) {
        if (param < 0 || param > 100) {
            System.out.println("Не верный параметр!");
        }
    }

    public static void compareHogwartsStudents(hogwarts student, hogwarts student2) {
        if (student.getPower() > student2.getPower()) {
            System.out.println(student + " обладает бОльшей мощностью магии, чем " + student2);
        } else if (student.getPower() < student2.getPower()) {
            System.out.println(student2 + " обладает бОльшей мощностью магии, чем " + student);
        } else {
            System.out.println("Студенты равны!");
        }
    }

    private int getPower() {
        return powerOfMagic + transgression;

    }

}
