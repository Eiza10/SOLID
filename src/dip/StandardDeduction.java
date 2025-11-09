package dip;

public class StandardDeduction implements IDeductionCalculator {
    @Override
    public float calcDeduction(float billAmount, int deductionPercentage) {
        return (billAmount * deductionPercentage) / 100;
    }
}
