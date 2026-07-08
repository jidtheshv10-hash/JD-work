 
class Solution {
    public double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        return new double[]{kelvin, fahrenheit};
    }
}
public class m8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double celsius = 25.0;
        double[] result = solution.convertTemperature(celsius);
        System.out.println("Kelvin: " + result[0] + ", Fahrenheit: " + result[1]);
    }
}