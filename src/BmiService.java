public class BmiService {
    public int calculate(double m, double kg) {
        double squaredHeight = Math.pow(m, 2);
        int result = (int) (kg / squaredHeight);
        return result;
    }
}
