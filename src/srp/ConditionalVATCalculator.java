package srp;

public class ConditionalVATCalculator extends VATCalculator {
    
    public ConditionalVATCalculator(float vatRate) {
        super(vatRate);
    }
    
    public float calculateVAT(float billAmount, String billCode) {
        if ("0".equals(billCode)) {
            return 0; // Ez aplikatu VAT
        }
        return calculateVAT(billAmount);
    }
}
