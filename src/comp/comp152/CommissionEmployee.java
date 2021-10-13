package comp.comp152;

public class CommissionEmployee extends Employee{
    private int numberOfSales;
    public final static double commissionRate = 100;  //public, final and static can go in any order, but double must be at the end

    public CommissionEmployee(){
        numberOfSales = 0;
    }


    public void makeSale(){
        numberOfSales++;
    }

    @Override
    public double calculateBiWeeklyPay(){
        var pay = 1000+numberOfSales*commissionRate;
        numberOfSales = 0;
        return pay;
    }
}
