public class BmiService {
    public int calculate(double m, double kg) {
        double squaredHeight = Math.pow(m, 2); // Переменная для хранения значения роста в квадрате
        int result = (int) (kg / squaredHeight); // Делим массу тела в кг на рост в метрах в квадрате, приводим к int
        return result;
    }
}
