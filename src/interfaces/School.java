package interfaces;



import static interfaces.ISalary.FOR_TC_PER_WEEK;
import static interfaces.tests.Assert.aAssert;

public class School {

    private static final String LINE = "________________________________________________________";
    private static final double EXPECTED_BASE_SALARY = 1440;
    private static final double EXPECTED_CLEAR_SALARY = 4172;


    public static void main(String[] args) {



        Student student1 = new Student("Masha", "Ivanova", 'F', 10, "Student",
                5);

        Student student2 = new Student("Vova", "Sidorov", 'M', 14, "Student",
                6);




        Parent parent1 = new Parent("Petr", "Ivanov", 'M', 45, "Parent",
                12345678911l, student1);

        Parent parent2 = new Parent("Elena", "Ivanova", 'F', 40, "Parent",
                98765432111l, student1);

        Parent parent3 = new Parent("Andrey", "Sidorov", 'M', 35, "Parent",
                12345678977l, student2);



        Teacher teacher1 = new Teacher("Maria Ivanovna", "Petrova", 'F', 35,
                "Teacher", "Russia Literatura", 2, FOR_TC_PER_WEEK);

        ISalary salaryForTeacher1 = teacher1;
        ISalary salaryForTeacher2 = new Teacher("Ivan Petrovich", "Petrov", 'M', 65,
                "Teacher", "Math", 1, FOR_TC_PER_WEEK);


        Parent[] parents = new Parent[]{parent1, parent2};

        parent1.printParent(); //печатаем инфо о родителях
        parent2.printParent();
        parent3.printParent();

        System.out.println(LINE);

        student1.printStudentsParent(parents); //печатаем инфо о студентах
        student2.printStudentsParent(parents);

        System.out.println(LINE);

        teacher1.printTeacher();


        aAssert(EXPECTED_BASE_SALARY, teacher1.getBaseSalary());
        aAssert(EXPECTED_CLEAR_SALARY, teacher1.getSalary());

        System.out.println(salaryForTeacher1.getTaxes());
        System.out.println(teacher1.getTaxes());




    }


}
