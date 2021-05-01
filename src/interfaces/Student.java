package interfaces;

public final class Student extends BasePerson {

    private final int grade;

    Student(String firstName, String lastName, char gender, int age, String status, int grade) {
        super(firstName, lastName, gender, age, status);
        this.grade = grade;

    }

    @Override
    public void setAge(int age) {
        if (age > 0) {
            this.setAge(age);
        }
    }

    @Override
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            super.setGender(gender);
        }
    }

    public int getGrade() {
        return grade;
    }

    public void printStudentsParent(Parent[] parents) {
        for (Parent parent : parents){ //цикл для подбора конкретного радителя конкретного студента. перебор родителей
            if (parent.getStudent().equals(this)) {
                System.out.println();
                System.out.println("Student:" + getFirstName() + ", " + getLastName() + ", grade: " + getGrade());
                System.out.println("Parent:" + parent.getFirstName() + " " +parent.getLastName() + ", " +
                        parent.getPhoneNumber());
            }
        }
    }




}
