package interfaces;

public final class Parent extends BasePerson {

    private long phoneNumber;
    private Student student; // привязываем конкретного ребенка к родителю, указывается при создании родителя

    public Parent(String firstName, String lastName, char gender, int age, String status, long phoneNumber,
                  Student student) {
        super(firstName, lastName, gender, age, status);
        this.phoneNumber = phoneNumber;
        this.student = student;
    }

    @Override
    public void setAge(int age) {
        if (age > 0) {
            this.setAge(age);
        }
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void printParent() {
        System.out.println("_______________________________________");
        System.out.println(getFirstName() + " " + getLastName() + ", is parent of student: "
                + student.getFirstName() + " " + student.getLastName() + ", " + student.getAge() + " years old, " + student.getGrade()
                + " grade.");
        System.out.println("Parent phone number: " + getPhoneNumber());
    }
}
