public class Main {
    public static void main(String[] args) {
        double index;
        BmiService bmi = new BmiService();
        index = bmi.calculate(70, 1.76);
        System.out.println("Индекс массы тела: " + index);
    }
}