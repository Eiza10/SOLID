package dip;

public class StandardVAT implements IVATCalculator {
    private static final float VAT_RATE = 0.16f;
    
    @Override
    public float calcVAT(float billAmount) {
        return billAmount * VAT_RATE;
    }
}
