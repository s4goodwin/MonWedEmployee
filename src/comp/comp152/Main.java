package comp.comp152;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var allEmployees = new ArrayList<Employee>();
        var emp1 = new CommissionEmployee();
        emp1.makeSale();
        emp1.makeSale();
        allEmployees.add(emp1);
        var emp2 = new SalariedEmployee(70000);
        allEmployees.add(emp2);
        for (var currentEmployee: allEmployees){
            System.out.println("now paying an employee of type "+ currentEmployee.getClass().getName()+
                    " who is getting paid " +currentEmployee.calculateBiWeeklyPay());

        }
    }
}
