package srp;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        // Kalkulagailuak sortu
        DeductionCalculator deductionCalc = new DeductionCalculator();
        VATCalculator vatCalc = new VATCalculator(); // 16% defektuz
        
        // Faktura sortu
        Bill bill = new Bill();
        bill.code = "001";
        bill.billDate = new Date(2025,05,05);
        bill.billAmount = 60000; // 50000 baino gehiago
        bill.deductionPercentage = 10;
        
        // Totala kalkulatu
        bill.totalCalc(deductionCalc, vatCalc);
        
        System.out.println("Bill Amount: " + bill.billAmount);
        System.out.println("Deduction: " + bill.billDeduction); // (60000 * 15) / 100 = 9000
        System.out.println("VAT: " + bill.VAT); // 60000 * 0.16 = 9600
        System.out.println("Total: " + bill.billTotal); // 60000 - 9000 + 9600 = 60600
    }
}
