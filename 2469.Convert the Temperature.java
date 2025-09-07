class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin,fahren;
        double arr[];
        arr= new double[2];
        kelvin=celsius+273.15;
        fahren=((celsius*1.80)+32.00);
        arr[0]=kelvin;
        arr[1]=fahren;
        return arr;
    }
}
