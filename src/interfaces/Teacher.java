package interfaces;



public final class Teacher extends BasePerson implements ISalary {


    private String subject;
    private int set;
    private double code;


    public Teacher(String firstName, String lastName, char gender, int age, String status, String subject, int sets,
                   double code) {
        super(firstName, lastName, gender, age, status);
        this.subject = subject;
        this.set = sets;
        this.code = code;
    }

    @Override
    public void setAge(int age) {
        if (age > 0) {
            this.setAge(age);
        }
    }

    @Override
    public double getTaxes() {
        System.out.println("Taxes: $");
        return getSalaryPerMounth() * 30/100;
    }

    @Override
    public double getBaseSalary() {
        return set * BASE_HOURES_SET * HOURLY_WAGE_PER_TEACHER;
    }

    public double getSalaryPerMounth() {
        return getBaseSalary() * 4 + FOR_TC_PER_WEEK * 4;
    }

    @Override //появился в результате параметра по зп из BaseEmployee - abstract
    public double getSalary() {
        return getSalaryPerMounth() - getTaxes();
    }




    public String getSubject() {
        return subject;
    }

    public void printTeacher() {
        System.out.println(getFirstName() + " " + getLastName() + ", subject: " + getSubject());
    }




}
