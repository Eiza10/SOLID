package dip;

public class ConditionalVAT implements IVATCalculator {
    private static final float VAT_RATE = 0.16f;
    private String billCode;
    
    public ConditionalVAT(String billCode) {
        this.billCode = billCode;
    }
    
    @Override
    public float calcVAT(float billAmount) {
        if ("0".equals(billCode)) {
            return 0f;
        }
        return billAmount * VAT_RATE;
    }
}
