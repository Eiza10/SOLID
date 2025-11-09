package srp;

import java.util.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;
    
    // Fakturaren totala kalkulatzeko kalkulagailuak erabiltzen ditu
    public void totalCalc(DeductionCalculator deductionCalc, VATCalculator vatCalc) {
        // Dedukzioa kalkulatu
        billDeduction = deductionCalc.calculateDeduction(billAmount, deductionPercentage);
        
        // VAT kalkulatu (konditional kalkulagailua bada, kodea ere pasatu)
        if (vatCalc instanceof ConditionalVATCalculator) {
            VAT = ((ConditionalVATCalculator) vatCalc).calculateVAT(billAmount, code);
        } else {
            VAT = vatCalc.calculateVAT(billAmount);
        }
        
        // Totala kalkulatu
        billTotal = (billAmount - billDeduction) + VAT;
    }
}