package srp;

public class VATCalculator {
    private float vatRate;
    
    public VATCalculator() {
        this.vatRate = 0.16f; // 16% defektuz
    }
    
    public VATCalculator(float vatRate) {
        this.vatRate = vatRate;
    }
    
    public float calculateVAT(float billAmount) {
        return billAmount * vatRate;
    }
    
    public void setVatRate(float vatRate) {
        this.vatRate = vatRate;
    }
}
