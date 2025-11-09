package dip;

import java.util.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;
    
    // Dependentzia abstrakzioekin
    private IDeductionCalculator deductionCalculator;
    private IVATCalculator vatCalculator;
    
    public Bill(IDeductionCalculator deductionCalculator, 
                IVATCalculator vatCalculator) {
        this.deductionCalculator = deductionCalculator;
        this.vatCalculator = vatCalculator;
    }
    
    public void totalCalc() {
        // Dedukzioa kalkulatu (abstrakzioaren bidez)
        billDeduction = deductionCalculator.calcDeduction(billAmount, deductionPercentage);
        
        // VAT kalkulatzen dugu (abstrakzioaren bidez)
        VAT = vatCalculator.calcVAT(billAmount);
        
        // Totala kalkulatzen dugu
        billTotal = (billAmount - billDeduction) + VAT;
    }
}
