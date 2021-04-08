public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(192,110);
        System.out.println("Ваш индекс массы тела = " + bmi);

        double bmi2 = service.calculate(166,53);
        System.out.println("Ваш индекс массы тела = " + bmi2);
    }
}
