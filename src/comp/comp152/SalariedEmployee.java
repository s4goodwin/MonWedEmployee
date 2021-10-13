package comp.comp152;

public class SalariedEmployee extends Employee{

    private double yearlySalary;

    public SalariedEmployee(double salary){ //constructor; no return type, method name is the same as class
        yearlySalary = salary;
    }

    @Override
    public double calculateBiWeeklyPay() {
        return yearlySalary/26;
    }
}
