package dip;

public class HighVAT implements IVATCalculator {
    private static final float VAT_RATE = 0.18f;
    
    @Override
    public float calcVAT(float billAmount) {
        return billAmount * VAT_RATE;
    }
}
