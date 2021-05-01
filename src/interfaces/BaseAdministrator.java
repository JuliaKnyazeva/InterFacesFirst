package interfaces;



public abstract class BaseAdministrator extends BasePerson implements ISalary{

    public BaseAdministrator(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    @Override
    public void setAge(int age) {
        if (age > 0) {
            this.setAge(age);
        }
    }

}
