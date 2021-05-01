package interfaces;

public abstract class BasePerson {

    String firstName;
    String lastName;
    char gender;
    int age;
    String status;
    static int countPerson;
    static String schoolName;  // статик, потому что эта инфа будет для всех одниковая, здесь это имя школы

    BasePerson(String firstName, String lastName, char gender, int age, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setGender(gender); // здесь появилась проверка на М и Ж, проверка в студентах
        this.age = age;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public abstract void setAge(int age);


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        BasePerson.schoolName = schoolName;
    }
}
