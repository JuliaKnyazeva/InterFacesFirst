package interfaces;

public interface ISalary {

    int BASE_HOURES_SET = 18;
    int TEACHER_COUNSELER = 1;
    double FOR_TC_PER_WEEK = 50;
    double HOURLY_WAGE_PER_TEACHER = 40;
    double TAX_PERCENTAGE = 30/100;

    //рабочая неделя = 40 часов, у учителя = базовая ставка (1 = 18) и еще ставка (2 = 18 + 18),
    // или полставки (0,5 = 9) или просто полставка (0,5 = 9), полторы ставки (1,5 = 27)
    //классное руководство - 50$

    double getBaseSalary();

    double getSalaryPerMounth();

    double getSalary();

    default double getTaxes() {
        return getSalaryPerMounth() * 30/100;
    };

}
