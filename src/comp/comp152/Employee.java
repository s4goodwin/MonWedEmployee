package comp.comp152;

public abstract class Employee {

    public void fileW2Forms(){
        System.out.println("here are W2 tax forms");
    }

    public void WithholdTaxes(){
        System.out.println("removing "+calculateBiWeeklyPay()*.1+" of your pay for taxes");
    }

    public abstract double calculateBiWeeklyPay();
}
