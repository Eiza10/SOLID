package dip;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection erabiliz
        IDeductionCalculator deductionCalc = new StandardDeduction();
        IVATCalculator vatCalc = new StandardVAT();
        
        Bill bill = new Bill(deductionCalc, vatCalc);
        bill.billAmount = 1000f;
        bill.deductionPercentage = 10;
        
        bill.totalCalc();
        
        System.out.println("Bill Total: " + bill.billTotal);
        System.out.println("Deduction: " + bill.billDeduction);
        System.out.println("VAT: " + bill.VAT);
    }
}
