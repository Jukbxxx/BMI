public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.67;
        double mass = 57;
        int bmi = service.calculate(height, mass);
        System.out.println(bmi);
    }
}