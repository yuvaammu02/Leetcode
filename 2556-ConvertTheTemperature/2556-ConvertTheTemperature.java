// Last updated: 12/08/2026, 11:53:56
class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;
        return new double[]{k,f}; 
    }
}